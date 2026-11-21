# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-152ee161-9686-4c18-93ce-a38019ec8013` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-e8d1141b-e2e1-46a1-b2f2-5790a20cecec` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-9bb130e5-fc3c-4f33-ac6e-96032e6b0903` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-d0ac2630-69aa-4125-abf8-744a53db9d76` |
| 5 | `POST /v1/credits/purchases` | 415 | 12 | `qa-dc744011-540a-473d-8af0-f0fae145ba8d` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-8213056c-c74e-4898-94db-ad8ec59ccdf0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-fa023d58-dfcd-4826-b05b-857abf409dc5` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-5fc0db7f-72f6-4262-a2f9-5a591b0826b9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-c708fe17-0063-4b2e-90a2-dfd26066f64f` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-e94d8777-453a-43e8-baec-92cfb32123bf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-152ee161-9686-4c18-93ce-a38019ec8013

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-152ee161-9686-4c18-93ce-a38019ec8013
Content-Type: application/json

--- request body ---
{"handle":"qa-68b701259c1c","displayName":"QA 68b701259c1c","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-152ee161-9686-4c18-93ce-a38019ec8013
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 7
Location: /v1/accounts/qa-68b701259c1c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4feda03d-2033-4e5e-9169-7ce6b5337fec","handle":"qa-68b701259c1c","displayName":"QA 68b701259c1c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.514970602Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e8d1141b-e2e1-46a1-b2f2-5790a20cecec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8d1141b-e2e1-46a1-b2f2-5790a20cecec
Content-Type: application/json

--- request body ---
{"handle":"qa-67b26b9b1cc9","displayName":"QA 67b26b9b1cc9","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8d1141b-e2e1-46a1-b2f2-5790a20cecec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 7
Location: /v1/accounts/qa-67b26b9b1cc9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c7a63afe-98d8-4679-b942-fe7d783d544b","handle":"qa-67b26b9b1cc9","displayName":"QA 67b26b9b1cc9","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.559290873Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9bb130e5-fc3c-4f33-ac6e-96032e6b0903

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bb130e5-fc3c-4f33-ac6e-96032e6b0903
Content-Type: application/json

--- request body ---
{"handle":"qa-68b701259c1c","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bb130e5-fc3c-4f33-ac6e-96032e6b0903
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4feda03d-2033-4e5e-9169-7ce6b5337fec"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d0ac2630-69aa-4125-abf8-744a53db9d76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0ac2630-69aa-4125-abf8-744a53db9d76
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-67b26b9b1cc9","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0ac2630-69aa-4125-abf8-744a53db9d76
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
Location: /v1/conversations/cnv_18e22169-260a-46d0-a561-ccdcd61a0ff3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_18e22169-260a-46d0-a561-ccdcd61a0ff3","subject":"Error contract","status":"open","region":"eu","participants":["qa-68b701259c1c","qa-67b26b9b1cc9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:08.695274653Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-dc744011-540a-473d-8af0-f0fae145ba8d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-17ec8f8fe1fb49bfb9e74e01c4cfc677
X-Correlation-Id: qa-dc744011-540a-473d-8af0-f0fae145ba8d
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc744011-540a-473d-8af0-f0fae145ba8d
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-dc744011-540a-473d-8af0-f0fae145ba8d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8213056c-c74e-4898-94db-ad8ec59ccdf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8213056c-c74e-4898-94db-ad8ec59ccdf0
Content-Type: application/json

--- request body ---
{"handle":"qa-67b26b9b1cc9","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-8213056c-c74e-4898-94db-ad8ec59ccdf0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c7a63afe-98d8-4679-b942-fe7d783d544b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa023d58-dfcd-4826-b05b-857abf409dc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa023d58-dfcd-4826-b05b-857abf409dc5
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa023d58-dfcd-4826-b05b-857abf409dc5
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-5fc0db7f-72f6-4262-a2f9-5a591b0826b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fc0db7f-72f6-4262-a2f9-5a591b0826b9
Content-Type: application/json

--- request body ---
{"handle":"qa-67b26b9b1cc9","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5fc0db7f-72f6-4262-a2f9-5a591b0826b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5fc0db7f-72f6-4262-a2f9-5a591b0826b9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c708fe17-0063-4b2e-90a2-dfd26066f64f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c708fe17-0063-4b2e-90a2-dfd26066f64f
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c708fe17-0063-4b2e-90a2-dfd26066f64f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e94d8777-453a-43e8-baec-92cfb32123bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e94d8777-453a-43e8-baec-92cfb32123bf
Content-Type: application/json

--- request body ---
{"handle":"qa-68b701259c1c","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e94d8777-453a-43e8-baec-92cfb32123bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e94d8777-453a-43e8-baec-92cfb32123bf"}
```
