# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-90f363a6-5303-425c-b2ff-eb37d6e9fdef` |
| 2 | `POST /v1/accounts` | 201 | 74 | `qa-7d258cda-cec8-4dad-8b5f-9a967a3d67bd` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-9418a4be-4fc5-4154-a892-e8c2801a4295` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-bf1f41ad-4744-4314-bd14-cb1b91cf96a6` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 20 | `qa-ef3f7eac-9c30-4f66-9d38-acbb6e8d2e86` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-08a0cc51-ba8d-48b9-8082-167bcdb03952` |
| 7 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-57e33f99-5103-4f3b-8626-720e8c2cf2b3` |
| 8 | `POST /v1/auth/token` | 401 | 32 | `qa-549b063e-1817-4adb-8b92-95fa7b34b957` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-adb8be7d-0e56-437d-9e31-bfcb38d0b233` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-127f4f06-64f6-459c-8fdc-d7810f8bdaab` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-90f363a6-5303-425c-b2ff-eb37d6e9fdef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90f363a6-5303-425c-b2ff-eb37d6e9fdef
Content-Type: application/json

--- request body ---
{"handle":"qa-cd92189e15bb","displayName":"QA cd92189e15bb","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-90f363a6-5303-425c-b2ff-eb37d6e9fdef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 6
Location: /v1/accounts/qa-cd92189e15bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8cfc3fbb-d8b6-492e-8b13-b173051ea107","handle":"qa-cd92189e15bb","displayName":"QA cd92189e15bb","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.758978621Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7d258cda-cec8-4dad-8b5f-9a967a3d67bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d258cda-cec8-4dad-8b5f-9a967a3d67bd
Content-Type: application/json

--- request body ---
{"handle":"qa-31de33fe1542","displayName":"QA 31de33fe1542","password":"****","region":"eu"}

--- response: 201 in 74 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d258cda-cec8-4dad-8b5f-9a967a3d67bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 6
Location: /v1/accounts/qa-31de33fe1542
X-Served-Region: eu
Content-Length: 181

{"id":"acc_916fd2af-7dfc-46c1-8033-b34ea45759f6","handle":"qa-31de33fe1542","displayName":"QA 31de33fe1542","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.832251728Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9418a4be-4fc5-4154-a892-e8c2801a4295

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9418a4be-4fc5-4154-a892-e8c2801a4295
Content-Type: application/json

--- request body ---
{"handle":"qa-cd92189e15bb","password":"****"}

--- response: 200 in 42 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-9418a4be-4fc5-4154-a892-e8c2801a4295
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8cfc3fbb-d8b6-492e-8b13-b173051ea107"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bf1f41ad-4744-4314-bd14-cb1b91cf96a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf1f41ad-4744-4314-bd14-cb1b91cf96a6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-31de33fe1542","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf1f41ad-4744-4314-bd14-cb1b91cf96a6
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
Location: /v1/conversations/cnv_65d3d18b-5ef7-4db7-a248-3eca27c90727
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_65d3d18b-5ef7-4db7-a248-3eca27c90727","subject":"Error contract","status":"open","region":"eu","participants":["qa-cd92189e15bb","qa-31de33fe1542"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:46.953265499Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_65d3d18b-5ef7-4db7-a248-3eca27c90727/messages
correlation: qa-ef3f7eac-9c30-4f66-9d38-acbb6e8d2e86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef3f7eac-9c30-4f66-9d38-acbb6e8d2e86
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef3f7eac-9c30-4f66-9d38-acbb6e8d2e86
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_65d3d18b-5ef7-4db7-a248-3eca27c90727/messages","correlationId":"qa-ef3f7eac-9c30-4f66-9d38-acbb6e8d2e86","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-08a0cc51-ba8d-48b9-8082-167bcdb03952

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08a0cc51-ba8d-48b9-8082-167bcdb03952
Content-Type: application/json

--- request body ---
{"handle":"qa-31de33fe1542","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-08a0cc51-ba8d-48b9-8082-167bcdb03952
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_916fd2af-7dfc-46c1-8033-b34ea45759f6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-57e33f99-5103-4f3b-8626-720e8c2cf2b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57e33f99-5103-4f3b-8626-720e8c2cf2b3
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-57e33f99-5103-4f3b-8626-720e8c2cf2b3
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
correlation: qa-549b063e-1817-4adb-8b92-95fa7b34b957

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-549b063e-1817-4adb-8b92-95fa7b34b957
Content-Type: application/json

--- request body ---
{"handle":"qa-31de33fe1542","password":"****"}

--- response: 401 in 32 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-549b063e-1817-4adb-8b92-95fa7b34b957
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-549b063e-1817-4adb-8b92-95fa7b34b957"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-adb8be7d-0e56-437d-9e31-bfcb38d0b233

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adb8be7d-0e56-437d-9e31-bfcb38d0b233
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-adb8be7d-0e56-437d-9e31-bfcb38d0b233
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
correlation: qa-127f4f06-64f6-459c-8fdc-d7810f8bdaab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-127f4f06-64f6-459c-8fdc-d7810f8bdaab
Content-Type: application/json

--- request body ---
{"handle":"qa-cd92189e15bb","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-127f4f06-64f6-459c-8fdc-d7810f8bdaab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-127f4f06-64f6-459c-8fdc-d7810f8bdaab"}
```
