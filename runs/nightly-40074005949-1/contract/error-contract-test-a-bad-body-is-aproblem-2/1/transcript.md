# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-ca8db1ca-40fb-4ca1-a8ae-c80d4780ba3d` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-0c421c44-1f46-4fe9-a4d9-bd5e19bac60d` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-663252d0-495c-41f2-b77d-aba88b78409c` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-afd41f39-5fef-477c-b348-08afac99481d` |
| 5 | `POST /v1/auth/token` | 422 | 46 | `qa-b4391ca8-d761-4ec8-9a29-e09913be1b08` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-e85c50aa-56fd-4b5c-84d7-321fd64ffff5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-c992f2d6-3211-468d-9f63-7eaeacae9be6` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-3ec25556-d93b-4572-bb81-41eec779b63e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-ae58bb71-36f1-4deb-8c85-3c4f286fce2a` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-735b3502-43f9-4b28-af35-a6297d9eb29a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ca8db1ca-40fb-4ca1-a8ae-c80d4780ba3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca8db1ca-40fb-4ca1-a8ae-c80d4780ba3d
Content-Type: application/json

--- request body ---
{"handle":"qa-1ef4d3110926","displayName":"QA 1ef4d3110926","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca8db1ca-40fb-4ca1-a8ae-c80d4780ba3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Location: /v1/accounts/qa-1ef4d3110926
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aa77cd12-dbd9-4f1a-baac-ec6bbbc136e9","handle":"qa-1ef4d3110926","displayName":"QA 1ef4d3110926","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.824111398Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0c421c44-1f46-4fe9-a4d9-bd5e19bac60d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c421c44-1f46-4fe9-a4d9-bd5e19bac60d
Content-Type: application/json

--- request body ---
{"handle":"qa-00817deda335","displayName":"QA 00817deda335","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c421c44-1f46-4fe9-a4d9-bd5e19bac60d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Location: /v1/accounts/qa-00817deda335
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8eeccc7-577b-4a9b-908f-4fa1b96f02e9","handle":"qa-00817deda335","displayName":"QA 00817deda335","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.860932516Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-663252d0-495c-41f2-b77d-aba88b78409c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-663252d0-495c-41f2-b77d-aba88b78409c
Content-Type: application/json

--- request body ---
{"handle":"qa-1ef4d3110926","password":"****"}

--- response: 200 in 45 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-663252d0-495c-41f2-b77d-aba88b78409c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aa77cd12-dbd9-4f1a-baac-ec6bbbc136e9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-afd41f39-5fef-477c-b348-08afac99481d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afd41f39-5fef-477c-b348-08afac99481d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-00817deda335","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-afd41f39-5fef-477c-b348-08afac99481d
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
Location: /v1/conversations/cnv_81f6837c-7320-40b1-b064-4e5f9cfffc61
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_81f6837c-7320-40b1-b064-4e5f9cfffc61","subject":"Error contract","status":"open","region":"eu","participants":["qa-1ef4d3110926","qa-00817deda335"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:01.976256033Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-b4391ca8-d761-4ec8-9a29-e09913be1b08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4391ca8-d761-4ec8-9a29-e09913be1b08
Content-Type: application/json

--- request body ---
{"handle":"qa-1ef4d3110926","password":"****","ttlSeconds":0}

--- response: 422 in 46 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4391ca8-d761-4ec8-9a29-e09913be1b08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-b4391ca8-d761-4ec8-9a29-e09913be1b08","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e85c50aa-56fd-4b5c-84d7-321fd64ffff5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e85c50aa-56fd-4b5c-84d7-321fd64ffff5
Content-Type: application/json

--- request body ---
{"handle":"qa-00817deda335","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e85c50aa-56fd-4b5c-84d7-321fd64ffff5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a8eeccc7-577b-4a9b-908f-4fa1b96f02e9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c992f2d6-3211-468d-9f63-7eaeacae9be6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c992f2d6-3211-468d-9f63-7eaeacae9be6
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c992f2d6-3211-468d-9f63-7eaeacae9be6
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
correlation: qa-3ec25556-d93b-4572-bb81-41eec779b63e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ec25556-d93b-4572-bb81-41eec779b63e
Content-Type: application/json

--- request body ---
{"handle":"qa-00817deda335","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ec25556-d93b-4572-bb81-41eec779b63e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3ec25556-d93b-4572-bb81-41eec779b63e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae58bb71-36f1-4deb-8c85-3c4f286fce2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae58bb71-36f1-4deb-8c85-3c4f286fce2a
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ae58bb71-36f1-4deb-8c85-3c4f286fce2a
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
correlation: qa-735b3502-43f9-4b28-af35-a6297d9eb29a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-735b3502-43f9-4b28-af35-a6297d9eb29a
Content-Type: application/json

--- request body ---
{"handle":"qa-1ef4d3110926","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-735b3502-43f9-4b28-af35-a6297d9eb29a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-735b3502-43f9-4b28-af35-a6297d9eb29a"}
```
