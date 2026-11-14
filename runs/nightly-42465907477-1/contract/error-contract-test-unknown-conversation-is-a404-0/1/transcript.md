# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-1e93a682-db96-4988-8e9f-ae02f4aeeeca` |
| 2 | `POST /v1/auth/token` | 200 | 6 | `qa-b8394f17-7d5f-407a-bbca-f0146b3f89cd` |
| 3 | `GET /v1/conversations/{id}` | 404 | 7 | `qa-05cc5675-b446-400f-8450-06e75013b535` |
| 4 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-1082c616-7dc0-4b0a-92ca-3d0812dc0e14` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-680ccd62-bd0c-4de8-83a1-e74ba8951952` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1e93a682-db96-4988-8e9f-ae02f4aeeeca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e93a682-db96-4988-8e9f-ae02f4aeeeca
Content-Type: application/json

--- request body ---
{"handle":"qa-f6d0921a919a","displayName":"QA f6d0921a919a","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e93a682-db96-4988-8e9f-ae02f4aeeeca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 8
Location: /v1/accounts/qa-f6d0921a919a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e16b8697-d441-4e97-a620-bdb448ddb9c2","handle":"qa-f6d0921a919a","displayName":"QA f6d0921a919a","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.854044354Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b8394f17-7d5f-407a-bbca-f0146b3f89cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8394f17-7d5f-407a-bbca-f0146b3f89cd
Content-Type: application/json

--- request body ---
{"handle":"qa-f6d0921a919a","password":"****"}

--- response: 200 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8394f17-7d5f-407a-bbca-f0146b3f89cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e16b8697-d441-4e97-a620-bdb448ddb9c2"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-05cc5675-b446-400f-8450-06e75013b535

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05cc5675-b446-400f-8450-06e75013b535
Content-Type: application/json

--- response: 404 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05cc5675-b446-400f-8450-06e75013b535
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-05cc5675-b446-400f-8450-06e75013b535"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1082c616-7dc0-4b0a-92ca-3d0812dc0e14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1082c616-7dc0-4b0a-92ca-3d0812dc0e14
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1082c616-7dc0-4b0a-92ca-3d0812dc0e14
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
correlation: qa-680ccd62-bd0c-4de8-83a1-e74ba8951952

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-680ccd62-bd0c-4de8-83a1-e74ba8951952
Content-Type: application/json

--- request body ---
{"handle":"qa-f6d0921a919a","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-680ccd62-bd0c-4de8-83a1-e74ba8951952
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-680ccd62-bd0c-4de8-83a1-e74ba8951952"}
```
