# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 73 | `qa-acc44b21-56ff-437f-b413-02667647db65` |
| 2 | `POST /v1/accounts` | 201 | 57 | `qa-6a4e9b66-daff-46b2-812c-dc81418ceebe` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-8bd45366-2aae-465f-8400-0e9abd18f3b3` |
| 4 | `POST /v1/conversations` | 201 | 36 | `qa-b190e5d3-4572-4d39-b76b-607702aafeb8` |
| 5 | `POST /v1/accounts` | 422 | 28 | `qa-d7aa0162-4c02-426c-a0fb-d2ffa10072ac` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-d6ae55ee-4bfc-4885-895a-aff140415ae8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-55715909-3f4f-42c6-a522-8258b7b6c94a` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-0249f1bb-bb0e-44fe-adb7-b2d422759af4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-01b00780-64b0-4bbc-93ce-46e204e7edd5` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-8c3e97bd-47b7-4483-8f61-bc8a2e7b0274` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-acc44b21-56ff-437f-b413-02667647db65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acc44b21-56ff-437f-b413-02667647db65
Content-Type: application/json

--- request body ---
{"handle":"qa-2dd85bf87bd8","displayName":"QA 2dd85bf87bd8","password":"****","region":"eu"}

--- response: 201 in 73 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-acc44b21-56ff-437f-b413-02667647db65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Location: /v1/accounts/qa-2dd85bf87bd8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f799f503-fafb-4467-a28d-75ba97fb82dc","handle":"qa-2dd85bf87bd8","displayName":"QA 2dd85bf87bd8","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.626775921Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6a4e9b66-daff-46b2-812c-dc81418ceebe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a4e9b66-daff-46b2-812c-dc81418ceebe
Content-Type: application/json

--- request body ---
{"handle":"qa-b1b74f9682d7","displayName":"QA b1b74f9682d7","password":"****","region":"eu"}

--- response: 201 in 57 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a4e9b66-daff-46b2-812c-dc81418ceebe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Location: /v1/accounts/qa-b1b74f9682d7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d9fb540-598f-413b-8b91-bfb2e3261037","handle":"qa-b1b74f9682d7","displayName":"QA b1b74f9682d7","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.692761364Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8bd45366-2aae-465f-8400-0e9abd18f3b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bd45366-2aae-465f-8400-0e9abd18f3b3
Content-Type: application/json

--- request body ---
{"handle":"qa-2dd85bf87bd8","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bd45366-2aae-465f-8400-0e9abd18f3b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f799f503-fafb-4467-a28d-75ba97fb82dc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b190e5d3-4572-4d39-b76b-607702aafeb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b190e5d3-4572-4d39-b76b-607702aafeb8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b1b74f9682d7","subject":"Error contract","message":"Hi"}

--- response: 201 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b190e5d3-4572-4d39-b76b-607702aafeb8
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
Location: /v1/conversations/cnv_5b5b0e9b-bed7-427d-b7a6-98788ed7dc16
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5b5b0e9b-bed7-427d-b7a6-98788ed7dc16","subject":"Error contract","status":"open","region":"eu","participants":["qa-2dd85bf87bd8","qa-b1b74f9682d7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:37.840382459Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-d7aa0162-4c02-426c-a0fb-d2ffa10072ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7aa0162-4c02-426c-a0fb-d2ffa10072ac
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 28 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7aa0162-4c02-426c-a0fb-d2ffa10072ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 7
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-d7aa0162-4c02-426c-a0fb-d2ffa10072ac","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d6ae55ee-4bfc-4885-895a-aff140415ae8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6ae55ee-4bfc-4885-895a-aff140415ae8
Content-Type: application/json

--- request body ---
{"handle":"qa-b1b74f9682d7","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6ae55ee-4bfc-4885-895a-aff140415ae8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d9fb540-598f-413b-8b91-bfb2e3261037"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-55715909-3f4f-42c6-a522-8258b7b6c94a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55715909-3f4f-42c6-a522-8258b7b6c94a
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-55715909-3f4f-42c6-a522-8258b7b6c94a
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
correlation: qa-0249f1bb-bb0e-44fe-adb7-b2d422759af4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0249f1bb-bb0e-44fe-adb7-b2d422759af4
Content-Type: application/json

--- request body ---
{"handle":"qa-b1b74f9682d7","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0249f1bb-bb0e-44fe-adb7-b2d422759af4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0249f1bb-bb0e-44fe-adb7-b2d422759af4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-01b00780-64b0-4bbc-93ce-46e204e7edd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01b00780-64b0-4bbc-93ce-46e204e7edd5
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-01b00780-64b0-4bbc-93ce-46e204e7edd5
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8c3e97bd-47b7-4483-8f61-bc8a2e7b0274

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c3e97bd-47b7-4483-8f61-bc8a2e7b0274
Content-Type: application/json

--- request body ---
{"handle":"qa-2dd85bf87bd8","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c3e97bd-47b7-4483-8f61-bc8a2e7b0274
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8c3e97bd-47b7-4483-8f61-bc8a2e7b0274"}
```
