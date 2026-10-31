# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-6cdc235f-441e-42e9-ad45-4040c171231e` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-ca90cc7a-5cfb-48c3-b433-3496c22cc558` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-62349ee1-9487-4a4a-ad87-f261630fa480` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-96f72108-b8ac-48d5-93ae-cd99d435175d` |
| 5 | `GET /v1/accounts/me` | 503 | 17 | `qa-a8db25ac-2cc7-4c93-92a3-b4b659635cc2` |
| 6 | `POST /v1/auth/token` | 200 | 82 | `qa-314fe641-318f-4bdc-a153-b137423ad557` |
| 7 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-a22073ee-42a4-43f0-999f-82fee08007f8` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-fd58b112-29ee-421e-8d67-7f4da919c85c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 66 | `qa-27de929f-8381-40a8-b72a-1f87c109a25f` |
| 10 | `POST /v1/auth/token` | 401 | 47 | `qa-175ed67e-24ea-4ea6-be7c-d84a90f77ce1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6cdc235f-441e-42e9-ad45-4040c171231e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cdc235f-441e-42e9-ad45-4040c171231e
Content-Type: application/json

--- request body ---
{"handle":"qa-6b258e86e72c","displayName":"QA 6b258e86e72c","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cdc235f-441e-42e9-ad45-4040c171231e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-6b258e86e72c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_732e3739-5c37-4e34-96f7-86a73e8e6735","handle":"qa-6b258e86e72c","displayName":"QA 6b258e86e72c","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.458239599Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ca90cc7a-5cfb-48c3-b433-3496c22cc558

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca90cc7a-5cfb-48c3-b433-3496c22cc558
Content-Type: application/json

--- request body ---
{"handle":"qa-03356ed826de","displayName":"QA 03356ed826de","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca90cc7a-5cfb-48c3-b433-3496c22cc558
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Location: /v1/accounts/qa-03356ed826de
X-Served-Region: eu
Content-Length: 181

{"id":"acc_05c7995e-7fe6-419d-a253-a401899ee588","handle":"qa-03356ed826de","displayName":"QA 03356ed826de","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.528519045Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-62349ee1-9487-4a4a-ad87-f261630fa480

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62349ee1-9487-4a4a-ad87-f261630fa480
Content-Type: application/json

--- request body ---
{"handle":"qa-6b258e86e72c","password":"****"}

--- response: 200 in 35 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-62349ee1-9487-4a4a-ad87-f261630fa480
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_732e3739-5c37-4e34-96f7-86a73e8e6735"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-96f72108-b8ac-48d5-93ae-cd99d435175d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96f72108-b8ac-48d5-93ae-cd99d435175d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-03356ed826de","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-96f72108-b8ac-48d5-93ae-cd99d435175d
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
Location: /v1/conversations/cnv_cb4f25b3-630e-47f8-bd00-23f5448bd217
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cb4f25b3-630e-47f8-bd00-23f5448bd217","subject":"Error contract","status":"open","region":"eu","participants":["qa-6b258e86e72c","qa-03356ed826de"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:32.642940241Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-a8db25ac-2cc7-4c93-92a3-b4b659635cc2

--- request headers ---
Accept: application/json
X-Fault-Key: 4fc1b09d-6dda-47d4-9dbb-19b826f6ce23
X-Fault: unavailable-once
X-Correlation-Id: qa-a8db25ac-2cc7-4c93-92a3-b4b659635cc2
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8db25ac-2cc7-4c93-92a3-b4b659635cc2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-a8db25ac-2cc7-4c93-92a3-b4b659635cc2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-314fe641-318f-4bdc-a153-b137423ad557

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-314fe641-318f-4bdc-a153-b137423ad557
Content-Type: application/json

--- request body ---
{"handle":"qa-03356ed826de","password":"****"}

--- response: 200 in 82 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-314fe641-318f-4bdc-a153-b137423ad557
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_05c7995e-7fe6-419d-a253-a401899ee588"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a22073ee-42a4-43f0-999f-82fee08007f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a22073ee-42a4-43f0-999f-82fee08007f8
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a22073ee-42a4-43f0-999f-82fee08007f8
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
correlation: qa-fd58b112-29ee-421e-8d67-7f4da919c85c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd58b112-29ee-421e-8d67-7f4da919c85c
Content-Type: application/json

--- request body ---
{"handle":"qa-03356ed826de","password":"****"}

--- response: 401 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd58b112-29ee-421e-8d67-7f4da919c85c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fd58b112-29ee-421e-8d67-7f4da919c85c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27de929f-8381-40a8-b72a-1f87c109a25f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27de929f-8381-40a8-b72a-1f87c109a25f
Content-Type: application/json

--- response: 204 in 66 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27de929f-8381-40a8-b72a-1f87c109a25f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-175ed67e-24ea-4ea6-be7c-d84a90f77ce1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-175ed67e-24ea-4ea6-be7c-d84a90f77ce1
Content-Type: application/json

--- request body ---
{"handle":"qa-6b258e86e72c","password":"****"}

--- response: 401 in 47 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-175ed67e-24ea-4ea6-be7c-d84a90f77ce1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-175ed67e-24ea-4ea6-be7c-d84a90f77ce1"}
```
