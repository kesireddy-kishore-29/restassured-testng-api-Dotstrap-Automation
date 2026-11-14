# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-4d770611-824c-46ce-a66c-8ce0ee88de14` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-87bc6048-d243-4d05-aa00-376f5d36d653` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-32a88b9d-e71d-4199-a68f-bc933ce94d93` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-9342545b-7163-4bc3-81fc-03a0da1bb93e` |
| 5 | `POST /v1/conversations` | 422 | 16 | `qa-1ae1bdbd-1399-4010-a469-7f2ecb7035e0` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-14a15c3b-6a03-42bb-b5b1-86c8620a5a34` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-f104ade4-6de6-401a-b712-efd7555cf0f6` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-150f0682-bb2c-442d-8d5a-acde46ca5d9b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-ec5744e8-ec44-45bd-a04f-52c416ddd432` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-50ab8040-2ab7-44e7-89fa-64c79f13b451` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4d770611-824c-46ce-a66c-8ce0ee88de14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d770611-824c-46ce-a66c-8ce0ee88de14
Content-Type: application/json

--- request body ---
{"handle":"qa-6f8f6e8164d8","displayName":"QA 6f8f6e8164d8","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d770611-824c-46ce-a66c-8ce0ee88de14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Location: /v1/accounts/qa-6f8f6e8164d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e8fc07be-3123-4743-80e2-045dc9ebf5d9","handle":"qa-6f8f6e8164d8","displayName":"QA 6f8f6e8164d8","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.637121140Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-87bc6048-d243-4d05-aa00-376f5d36d653

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87bc6048-d243-4d05-aa00-376f5d36d653
Content-Type: application/json

--- request body ---
{"handle":"qa-9ec27dd53725","displayName":"QA 9ec27dd53725","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-87bc6048-d243-4d05-aa00-376f5d36d653
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 8
Location: /v1/accounts/qa-9ec27dd53725
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4a37932e-5a1a-407b-ad1d-3353a899306e","handle":"qa-9ec27dd53725","displayName":"QA 9ec27dd53725","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.672121054Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-32a88b9d-e71d-4199-a68f-bc933ce94d93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32a88b9d-e71d-4199-a68f-bc933ce94d93
Content-Type: application/json

--- request body ---
{"handle":"qa-6f8f6e8164d8","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-32a88b9d-e71d-4199-a68f-bc933ce94d93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e8fc07be-3123-4743-80e2-045dc9ebf5d9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9342545b-7163-4bc3-81fc-03a0da1bb93e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9342545b-7163-4bc3-81fc-03a0da1bb93e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9ec27dd53725","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-9342545b-7163-4bc3-81fc-03a0da1bb93e
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
Location: /v1/conversations/cnv_72f9301e-8bfb-4190-b87c-c8d0801f1c40
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_72f9301e-8bfb-4190-b87c-c8d0801f1c40","subject":"Error contract","status":"open","region":"eu","participants":["qa-6f8f6e8164d8","qa-9ec27dd53725"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.731489886Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-1ae1bdbd-1399-4010-a469-7f2ecb7035e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ae1bdbd-1399-4010-a469-7f2ecb7035e0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9ec27dd53725","subject":" ","message":"Hi"}

--- response: 422 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ae1bdbd-1399-4010-a469-7f2ecb7035e0
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-1ae1bdbd-1399-4010-a469-7f2ecb7035e0","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-14a15c3b-6a03-42bb-b5b1-86c8620a5a34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14a15c3b-6a03-42bb-b5b1-86c8620a5a34
Content-Type: application/json

--- request body ---
{"handle":"qa-9ec27dd53725","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-14a15c3b-6a03-42bb-b5b1-86c8620a5a34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4a37932e-5a1a-407b-ad1d-3353a899306e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f104ade4-6de6-401a-b712-efd7555cf0f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f104ade4-6de6-401a-b712-efd7555cf0f6
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f104ade4-6de6-401a-b712-efd7555cf0f6
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
correlation: qa-150f0682-bb2c-442d-8d5a-acde46ca5d9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-150f0682-bb2c-442d-8d5a-acde46ca5d9b
Content-Type: application/json

--- request body ---
{"handle":"qa-9ec27dd53725","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-150f0682-bb2c-442d-8d5a-acde46ca5d9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-150f0682-bb2c-442d-8d5a-acde46ca5d9b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ec5744e8-ec44-45bd-a04f-52c416ddd432

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec5744e8-ec44-45bd-a04f-52c416ddd432
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ec5744e8-ec44-45bd-a04f-52c416ddd432
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
correlation: qa-50ab8040-2ab7-44e7-89fa-64c79f13b451

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50ab8040-2ab7-44e7-89fa-64c79f13b451
Content-Type: application/json

--- request body ---
{"handle":"qa-6f8f6e8164d8","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50ab8040-2ab7-44e7-89fa-64c79f13b451
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-50ab8040-2ab7-44e7-89fa-64c79f13b451"}
```
