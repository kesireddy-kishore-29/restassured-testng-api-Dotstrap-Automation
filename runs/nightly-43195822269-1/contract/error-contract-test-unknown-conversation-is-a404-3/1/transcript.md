# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-277b248f-7c14-4280-bd3a-e65e9bbbcd8a` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-50270486-0c46-4f90-93b8-ff90c5e7a19e` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 6 | `qa-ce002bb2-d0a8-416c-8cf9-703b01d20a3e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-4fdccabc-78d1-4b21-934d-20392c9f07fc` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-1f20a791-e892-493d-82ef-8ed084350add` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-277b248f-7c14-4280-bd3a-e65e9bbbcd8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-277b248f-7c14-4280-bd3a-e65e9bbbcd8a
Content-Type: application/json

--- request body ---
{"handle":"qa-b072fb56dc5a","displayName":"QA b072fb56dc5a","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-277b248f-7c14-4280-bd3a-e65e9bbbcd8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 7
Location: /v1/accounts/qa-b072fb56dc5a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4c1e5764-91b8-497b-87ac-72dbed8c74d6","handle":"qa-b072fb56dc5a","displayName":"QA b072fb56dc5a","region":"eu","role":"user","createdAt":"2026-11-12T09:56:32.425670961Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-50270486-0c46-4f90-93b8-ff90c5e7a19e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50270486-0c46-4f90-93b8-ff90c5e7a19e
Content-Type: application/json

--- request body ---
{"handle":"qa-b072fb56dc5a","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-50270486-0c46-4f90-93b8-ff90c5e7a19e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4c1e5764-91b8-497b-87ac-72dbed8c74d6"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-ce002bb2-d0a8-416c-8cf9-703b01d20a3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce002bb2-d0a8-416c-8cf9-703b01d20a3e
Content-Type: application/json

--- response: 404 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce002bb2-d0a8-416c-8cf9-703b01d20a3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 258

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-ce002bb2-d0a8-416c-8cf9-703b01d20a3e"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4fdccabc-78d1-4b21-934d-20392c9f07fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fdccabc-78d1-4b21-934d-20392c9f07fc
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4fdccabc-78d1-4b21-934d-20392c9f07fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-1f20a791-e892-493d-82ef-8ed084350add

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f20a791-e892-493d-82ef-8ed084350add
Content-Type: application/json

--- request body ---
{"handle":"qa-b072fb56dc5a","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f20a791-e892-493d-82ef-8ed084350add
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f20a791-e892-493d-82ef-8ed084350add"}
```
