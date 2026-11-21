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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-bb203007-a6b4-4635-9b10-1c75951b041c` |
| 2 | `POST /v1/auth/token` | 200 | 11 | `qa-bc14503d-9a3c-4afb-a311-b448b0b289b5` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 22 | `qa-d3988783-29d4-430b-8e37-bcf93ed3c3d8` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-1e1ff101-4995-4eba-915b-14277279e6bf` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-91443f6f-90f3-4e5d-b48c-3a1b37558a63` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bb203007-a6b4-4635-9b10-1c75951b041c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb203007-a6b4-4635-9b10-1c75951b041c
Content-Type: application/json

--- request body ---
{"handle":"qa-8d437b7c24a8","displayName":"QA 8d437b7c24a8","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb203007-a6b4-4635-9b10-1c75951b041c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 7
Location: /v1/accounts/qa-8d437b7c24a8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6ef38909-2efb-48cd-8122-1cf234e4c366","handle":"qa-8d437b7c24a8","displayName":"QA 8d437b7c24a8","region":"eu","role":"user","createdAt":"2026-11-18T10:19:53.284748570Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-bc14503d-9a3c-4afb-a311-b448b0b289b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc14503d-9a3c-4afb-a311-b448b0b289b5
Content-Type: application/json

--- request body ---
{"handle":"qa-8d437b7c24a8","password":"****"}

--- response: 200 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc14503d-9a3c-4afb-a311-b448b0b289b5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6ef38909-2efb-48cd-8122-1cf234e4c366"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-d3988783-29d4-430b-8e37-bcf93ed3c3d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3988783-29d4-430b-8e37-bcf93ed3c3d8
Content-Type: application/json

--- response: 404 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d3988783-29d4-430b-8e37-bcf93ed3c3d8
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-d3988783-29d4-430b-8e37-bcf93ed3c3d8"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1e1ff101-4995-4eba-915b-14277279e6bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e1ff101-4995-4eba-915b-14277279e6bf
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1e1ff101-4995-4eba-915b-14277279e6bf
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
correlation: qa-91443f6f-90f3-4e5d-b48c-3a1b37558a63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91443f6f-90f3-4e5d-b48c-3a1b37558a63
Content-Type: application/json

--- request body ---
{"handle":"qa-8d437b7c24a8","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-91443f6f-90f3-4e5d-b48c-3a1b37558a63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-91443f6f-90f3-4e5d-b48c-3a1b37558a63"}
```
