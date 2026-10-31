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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-576c9b49-583d-4749-9051-7c434d9e3d22` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-75790627-627f-44c2-8256-f31063a4192f` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-d679e11f-a8b7-4ff0-980b-771f0b9028c0` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-ecb3d0e7-1875-4e7c-b4d4-221bc1442c87` |
| 5 | `POST /v1/auth/token` | 422 | 44 | `qa-0c7a7f56-eec5-4da3-9e7d-8d80403d4908` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-448e61ff-d8e3-4f89-b56e-09c47aecb028` |
| 7 | `DELETE /v1/accounts/me` | 204 | 46 | `qa-b6e14a2e-9a59-45b4-b65f-04010812c33e` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-938e322b-604b-4482-84e4-8407666a57ab` |
| 9 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-fba6d4d2-049a-4546-9f20-c7f15fd38445` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-b838303c-eb6f-4e0e-9be3-34451f126791` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-576c9b49-583d-4749-9051-7c434d9e3d22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-576c9b49-583d-4749-9051-7c434d9e3d22
Content-Type: application/json

--- request body ---
{"handle":"qa-8d96bab903b3","displayName":"QA 8d96bab903b3","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-576c9b49-583d-4749-9051-7c434d9e3d22
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Location: /v1/accounts/qa-8d96bab903b3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_08008087-dfe9-42d2-bb6c-ce7e48ffda2c","handle":"qa-8d96bab903b3","displayName":"QA 8d96bab903b3","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.042262861Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-75790627-627f-44c2-8256-f31063a4192f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75790627-627f-44c2-8256-f31063a4192f
Content-Type: application/json

--- request body ---
{"handle":"qa-2710481de368","displayName":"QA 2710481de368","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-75790627-627f-44c2-8256-f31063a4192f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Location: /v1/accounts/qa-2710481de368
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5113ddbb-c5fb-4ab1-8ef4-4fc1b14e2cf8","handle":"qa-2710481de368","displayName":"QA 2710481de368","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.090526699Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d679e11f-a8b7-4ff0-980b-771f0b9028c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d679e11f-a8b7-4ff0-980b-771f0b9028c0
Content-Type: application/json

--- request body ---
{"handle":"qa-8d96bab903b3","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-d679e11f-a8b7-4ff0-980b-771f0b9028c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_08008087-dfe9-42d2-bb6c-ce7e48ffda2c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ecb3d0e7-1875-4e7c-b4d4-221bc1442c87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecb3d0e7-1875-4e7c-b4d4-221bc1442c87
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2710481de368","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecb3d0e7-1875-4e7c-b4d4-221bc1442c87
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
Location: /v1/conversations/cnv_f2021059-b00a-4c82-b617-25695648d929
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f2021059-b00a-4c82-b617-25695648d929","subject":"Error contract","status":"open","region":"eu","participants":["qa-8d96bab903b3","qa-2710481de368"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:24.171491899Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-0c7a7f56-eec5-4da3-9e7d-8d80403d4908

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c7a7f56-eec5-4da3-9e7d-8d80403d4908
Content-Type: application/json

--- request body ---
{"handle":"qa-8d96bab903b3","password":"****","ttlSeconds":0}

--- response: 422 in 44 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c7a7f56-eec5-4da3-9e7d-8d80403d4908
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-0c7a7f56-eec5-4da3-9e7d-8d80403d4908","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-448e61ff-d8e3-4f89-b56e-09c47aecb028

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-448e61ff-d8e3-4f89-b56e-09c47aecb028
Content-Type: application/json

--- request body ---
{"handle":"qa-2710481de368","password":"****"}

--- response: 200 in 51 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-448e61ff-d8e3-4f89-b56e-09c47aecb028
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5113ddbb-c5fb-4ab1-8ef4-4fc1b14e2cf8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b6e14a2e-9a59-45b4-b65f-04010812c33e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6e14a2e-9a59-45b4-b65f-04010812c33e
Content-Type: application/json

--- response: 204 in 46 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b6e14a2e-9a59-45b4-b65f-04010812c33e
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
correlation: qa-938e322b-604b-4482-84e4-8407666a57ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-938e322b-604b-4482-84e4-8407666a57ab
Content-Type: application/json

--- request body ---
{"handle":"qa-2710481de368","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-938e322b-604b-4482-84e4-8407666a57ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-938e322b-604b-4482-84e4-8407666a57ab"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fba6d4d2-049a-4546-9f20-c7f15fd38445

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fba6d4d2-049a-4546-9f20-c7f15fd38445
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fba6d4d2-049a-4546-9f20-c7f15fd38445
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
correlation: qa-b838303c-eb6f-4e0e-9be3-34451f126791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b838303c-eb6f-4e0e-9be3-34451f126791
Content-Type: application/json

--- request body ---
{"handle":"qa-8d96bab903b3","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b838303c-eb6f-4e0e-9be3-34451f126791
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b838303c-eb6f-4e0e-9be3-34451f126791"}
```
