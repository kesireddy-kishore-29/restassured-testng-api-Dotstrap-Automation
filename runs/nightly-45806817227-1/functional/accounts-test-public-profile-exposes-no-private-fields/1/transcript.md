# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-d3017367-ff56-4bda-a2d9-3698cfcb45aa` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-d22f5495-1310-49ed-93af-03d641321af8` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-fd6f45ec-0db0-4b21-be59-18f1b668af04` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 12 | `qa-83cbfb22-4851-408e-8a3a-bd41e3d2f543` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 9 | `qa-88c74c80-81c6-4b46-901f-ba6f8ea8657f` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 13 | `qa-f128ef11-f0b9-4e07-bfcf-be5422e37eb7` |
| 7 | `POST /v1/auth/token` | 200 | 13 | `qa-0a0031f5-9351-4176-97e4-e8e380ef9697` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-f9b7a9e0-9cc9-42aa-9c26-1396780bcec9` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-6ec027b5-1b29-4fc5-8450-1ed4d17edccb` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-3bbd0647-118a-4d6c-ae6f-c6dede986929` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-408511d8-68e5-4317-8d3d-0565808de210` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d3017367-ff56-4bda-a2d9-3698cfcb45aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3017367-ff56-4bda-a2d9-3698cfcb45aa
Content-Type: application/json

--- request body ---
{"handle":"qa-a8770b49a2eb","displayName":"QA a8770b49a2eb","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3017367-ff56-4bda-a2d9-3698cfcb45aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Location: /v1/accounts/qa-a8770b49a2eb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_41fe3738-db94-4440-922e-725618b9378b","handle":"qa-a8770b49a2eb","displayName":"QA a8770b49a2eb","region":"eu","role":"user","createdAt":"2026-11-26T11:02:34.286809037Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d22f5495-1310-49ed-93af-03d641321af8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d22f5495-1310-49ed-93af-03d641321af8
Content-Type: application/json

--- request body ---
{"handle":"qa-668a366915eb","displayName":"QA 668a366915eb","password":"****","region":"us"}

--- response: 201 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-d22f5495-1310-49ed-93af-03d641321af8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-668a366915eb
X-Served-Region: us
Content-Length: 181

{"id":"acc_71441c17-548c-4b9e-a632-077771d0785f","handle":"qa-668a366915eb","displayName":"QA 668a366915eb","region":"us","role":"user","createdAt":"2026-11-26T11:02:34.315846551Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fd6f45ec-0db0-4b21-be59-18f1b668af04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd6f45ec-0db0-4b21-be59-18f1b668af04
Content-Type: application/json

--- request body ---
{"handle":"qa-a8770b49a2eb","password":"****"}

--- response: 200 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd6f45ec-0db0-4b21-be59-18f1b668af04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_41fe3738-db94-4440-922e-725618b9378b"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-668a366915eb
correlation: qa-83cbfb22-4851-408e-8a3a-bd41e3d2f543

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83cbfb22-4851-408e-8a3a-bd41e3d2f543
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-83cbfb22-4851-408e-8a3a-bd41e3d2f543
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
Content-Length: 74

{"handle":"qa-668a366915eb","displayName":"QA 668a366915eb","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-668a366915eb
correlation: qa-88c74c80-81c6-4b46-901f-ba6f8ea8657f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88c74c80-81c6-4b46-901f-ba6f8ea8657f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-88c74c80-81c6-4b46-901f-ba6f8ea8657f
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
Content-Length: 74

{"handle":"qa-668a366915eb","displayName":"QA 668a366915eb","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-668a366915eb
correlation: qa-f128ef11-f0b9-4e07-bfcf-be5422e37eb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f128ef11-f0b9-4e07-bfcf-be5422e37eb7
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f128ef11-f0b9-4e07-bfcf-be5422e37eb7
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
Content-Length: 74

{"handle":"qa-668a366915eb","displayName":"QA 668a366915eb","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-0a0031f5-9351-4176-97e4-e8e380ef9697

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a0031f5-9351-4176-97e4-e8e380ef9697
Content-Type: application/json

--- request body ---
{"handle":"qa-668a366915eb","password":"****"}

--- response: 200 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a0031f5-9351-4176-97e4-e8e380ef9697
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_71441c17-548c-4b9e-a632-077771d0785f"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f9b7a9e0-9cc9-42aa-9c26-1396780bcec9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9b7a9e0-9cc9-42aa-9c26-1396780bcec9
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f9b7a9e0-9cc9-42aa-9c26-1396780bcec9
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
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-6ec027b5-1b29-4fc5-8450-1ed4d17edccb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ec027b5-1b29-4fc5-8450-1ed4d17edccb
Content-Type: application/json

--- request body ---
{"handle":"qa-668a366915eb","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ec027b5-1b29-4fc5-8450-1ed4d17edccb
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ec027b5-1b29-4fc5-8450-1ed4d17edccb"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3bbd0647-118a-4d6c-ae6f-c6dede986929

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bbd0647-118a-4d6c-ae6f-c6dede986929
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3bbd0647-118a-4d6c-ae6f-c6dede986929
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-408511d8-68e5-4317-8d3d-0565808de210

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-408511d8-68e5-4317-8d3d-0565808de210
Content-Type: application/json

--- request body ---
{"handle":"qa-a8770b49a2eb","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-408511d8-68e5-4317-8d3d-0565808de210
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-408511d8-68e5-4317-8d3d-0565808de210"}
```
