# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-5ca28d68-2a6c-4daf-938c-e039c44988ed` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-6bb3a111-696f-494c-a4bc-7481e0537dbd` |
| 3 | `POST /v1/auth/token` | 200 | 77 | `qa-39a2ad0a-ffed-49e2-8c10-60b1ccb56231` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-3562e412-d66e-4ad5-ad78-5b5d6a2e9f41` |
| 5 | `POST /v1/credits/purchases` | 400 | 16 | `qa-288d108c-5781-47ef-ab84-9fb341d298c1` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-b106eedc-e16e-45ad-b501-8b172a5ceaf2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-7bace503-1aa8-45a9-b446-e348311888c6` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-5a8046e1-bb45-4eb6-96de-c3ad6fa7c3e0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-8e69a248-005e-457d-96d8-721d5e00971d` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-5faad7c6-5b38-4e9d-a5d3-4f2c5ac5a183` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5ca28d68-2a6c-4daf-938c-e039c44988ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ca28d68-2a6c-4daf-938c-e039c44988ed
Content-Type: application/json

--- request body ---
{"handle":"qa-fd8fb1f92916","displayName":"QA fd8fb1f92916","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ca28d68-2a6c-4daf-938c-e039c44988ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 7
Location: /v1/accounts/qa-fd8fb1f92916
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92186b4b-ada1-40c1-8146-4ff86994124a","handle":"qa-fd8fb1f92916","displayName":"QA fd8fb1f92916","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.085452732Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6bb3a111-696f-494c-a4bc-7481e0537dbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bb3a111-696f-494c-a4bc-7481e0537dbd
Content-Type: application/json

--- request body ---
{"handle":"qa-82bffe2fddab","displayName":"QA 82bffe2fddab","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bb3a111-696f-494c-a4bc-7481e0537dbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 7
Location: /v1/accounts/qa-82bffe2fddab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ef1fd0b1-ad9d-4e8f-8bb2-e625c912ab91","handle":"qa-82bffe2fddab","displayName":"QA 82bffe2fddab","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.127081138Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-39a2ad0a-ffed-49e2-8c10-60b1ccb56231

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39a2ad0a-ffed-49e2-8c10-60b1ccb56231
Content-Type: application/json

--- request body ---
{"handle":"qa-fd8fb1f92916","password":"****"}

--- response: 200 in 77 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-39a2ad0a-ffed-49e2-8c10-60b1ccb56231
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_92186b4b-ada1-40c1-8146-4ff86994124a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3562e412-d66e-4ad5-ad78-5b5d6a2e9f41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3562e412-d66e-4ad5-ad78-5b5d6a2e9f41
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-82bffe2fddab","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3562e412-d66e-4ad5-ad78-5b5d6a2e9f41
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
Location: /v1/conversations/cnv_1e2cdce9-9641-489b-8873-90daf34d702b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1e2cdce9-9641-489b-8873-90daf34d702b","subject":"Error contract","status":"open","region":"eu","participants":["qa-fd8fb1f92916","qa-82bffe2fddab"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:08.252490236Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-288d108c-5781-47ef-ab84-9fb341d298c1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a9f412530e68426d837edf58d93cc435
X-Correlation-Id: qa-288d108c-5781-47ef-ab84-9fb341d298c1
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-288d108c-5781-47ef-ab84-9fb341d298c1
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-288d108c-5781-47ef-ab84-9fb341d298c1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b106eedc-e16e-45ad-b501-8b172a5ceaf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b106eedc-e16e-45ad-b501-8b172a5ceaf2
Content-Type: application/json

--- request body ---
{"handle":"qa-82bffe2fddab","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-b106eedc-e16e-45ad-b501-8b172a5ceaf2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ef1fd0b1-ad9d-4e8f-8bb2-e625c912ab91"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7bace503-1aa8-45a9-b446-e348311888c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bace503-1aa8-45a9-b446-e348311888c6
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7bace503-1aa8-45a9-b446-e348311888c6
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
correlation: qa-5a8046e1-bb45-4eb6-96de-c3ad6fa7c3e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a8046e1-bb45-4eb6-96de-c3ad6fa7c3e0
Content-Type: application/json

--- request body ---
{"handle":"qa-82bffe2fddab","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a8046e1-bb45-4eb6-96de-c3ad6fa7c3e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5a8046e1-bb45-4eb6-96de-c3ad6fa7c3e0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e69a248-005e-457d-96d8-721d5e00971d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e69a248-005e-457d-96d8-721d5e00971d
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e69a248-005e-457d-96d8-721d5e00971d
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
correlation: qa-5faad7c6-5b38-4e9d-a5d3-4f2c5ac5a183

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5faad7c6-5b38-4e9d-a5d3-4f2c5ac5a183
Content-Type: application/json

--- request body ---
{"handle":"qa-fd8fb1f92916","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5faad7c6-5b38-4e9d-a5d3-4f2c5ac5a183
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5faad7c6-5b38-4e9d-a5d3-4f2c5ac5a183"}
```
