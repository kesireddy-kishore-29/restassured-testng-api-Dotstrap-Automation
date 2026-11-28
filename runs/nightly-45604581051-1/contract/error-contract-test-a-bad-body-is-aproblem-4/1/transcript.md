# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-04abd40e-dfc1-4750-8219-5d8468e4568a` |
| 2 | `POST /v1/accounts` | 201 | 54 | `qa-c2345712-8ab8-4dd3-a0dc-5f57d802f2d4` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-3eb34120-8f2a-4502-bd68-ff0e2580a4d1` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-fac44325-021e-4135-a53b-28e51c187eae` |
| 5 | `POST /v1/accounts` | 415 | 20 | `qa-82729559-ec2f-4d9c-8cf1-68f91cdf941d` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-466118a0-5c57-4c96-935a-7f2b5ebc93d7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-129bf2b1-61eb-41df-9874-d9f864de4bd7` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-ec5fb175-7571-43c1-8569-60b1be8ecff2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-5e0571f1-0610-4e15-a519-86eb4eda7691` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-f49d7245-ea1c-4d8a-b1ce-bd3dd9f0fc4f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-04abd40e-dfc1-4750-8219-5d8468e4568a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04abd40e-dfc1-4750-8219-5d8468e4568a
Content-Type: application/json

--- request body ---
{"handle":"qa-9a26a208e32c","displayName":"QA 9a26a208e32c","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-04abd40e-dfc1-4750-8219-5d8468e4568a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Location: /v1/accounts/qa-9a26a208e32c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_29c7e53d-86ac-460a-8231-efa5eeb260f6","handle":"qa-9a26a208e32c","displayName":"QA 9a26a208e32c","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.396824989Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c2345712-8ab8-4dd3-a0dc-5f57d802f2d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2345712-8ab8-4dd3-a0dc-5f57d802f2d4
Content-Type: application/json

--- request body ---
{"handle":"qa-5bc9c65c225c","displayName":"QA 5bc9c65c225c","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2345712-8ab8-4dd3-a0dc-5f57d802f2d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Location: /v1/accounts/qa-5bc9c65c225c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d5377e4b-67ac-4ebb-b4cb-2fd580861ba0","handle":"qa-5bc9c65c225c","displayName":"QA 5bc9c65c225c","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.475792744Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3eb34120-8f2a-4502-bd68-ff0e2580a4d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3eb34120-8f2a-4502-bd68-ff0e2580a4d1
Content-Type: application/json

--- request body ---
{"handle":"qa-9a26a208e32c","password":"****"}

--- response: 200 in 36 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3eb34120-8f2a-4502-bd68-ff0e2580a4d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_29c7e53d-86ac-460a-8231-efa5eeb260f6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fac44325-021e-4135-a53b-28e51c187eae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fac44325-021e-4135-a53b-28e51c187eae
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5bc9c65c225c","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-fac44325-021e-4135-a53b-28e51c187eae
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
Location: /v1/conversations/cnv_9d1bea92-94d9-4f49-b8f9-f775fab29057
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9d1bea92-94d9-4f49-b8f9-f775fab29057","subject":"Error contract","status":"open","region":"eu","participants":["qa-9a26a208e32c","qa-5bc9c65c225c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:58.574179761Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-82729559-ec2f-4d9c-8cf1-68f91cdf941d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82729559-ec2f-4d9c-8cf1-68f91cdf941d
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-82729559-ec2f-4d9c-8cf1-68f91cdf941d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-82729559-ec2f-4d9c-8cf1-68f91cdf941d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-466118a0-5c57-4c96-935a-7f2b5ebc93d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-466118a0-5c57-4c96-935a-7f2b5ebc93d7
Content-Type: application/json

--- request body ---
{"handle":"qa-5bc9c65c225c","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-466118a0-5c57-4c96-935a-7f2b5ebc93d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d5377e4b-67ac-4ebb-b4cb-2fd580861ba0"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-129bf2b1-61eb-41df-9874-d9f864de4bd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-129bf2b1-61eb-41df-9874-d9f864de4bd7
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-129bf2b1-61eb-41df-9874-d9f864de4bd7
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
correlation: qa-ec5fb175-7571-43c1-8569-60b1be8ecff2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec5fb175-7571-43c1-8569-60b1be8ecff2
Content-Type: application/json

--- request body ---
{"handle":"qa-5bc9c65c225c","password":"****"}

--- response: 401 in 27 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec5fb175-7571-43c1-8569-60b1be8ecff2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ec5fb175-7571-43c1-8569-60b1be8ecff2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e0571f1-0610-4e15-a519-86eb4eda7691

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e0571f1-0610-4e15-a519-86eb4eda7691
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e0571f1-0610-4e15-a519-86eb4eda7691
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
correlation: qa-f49d7245-ea1c-4d8a-b1ce-bd3dd9f0fc4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f49d7245-ea1c-4d8a-b1ce-bd3dd9f0fc4f
Content-Type: application/json

--- request body ---
{"handle":"qa-9a26a208e32c","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f49d7245-ea1c-4d8a-b1ce-bd3dd9f0fc4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f49d7245-ea1c-4d8a-b1ce-bd3dd9f0fc4f"}
```
