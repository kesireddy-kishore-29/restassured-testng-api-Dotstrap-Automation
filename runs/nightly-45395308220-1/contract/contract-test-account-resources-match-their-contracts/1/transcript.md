# Transcript: Account, token and public profile match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#accountResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01, FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-ee8f3440-a880-4c69-8530-6e47d674f4d6` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-62ee01b8-8880-4c4a-9950-9bfdb81e3123` |
| 3 | `POST /v1/auth/token` | 200 | 9 | `qa-bf044e8e-389d-4007-81fe-6795d91421a8` |
| 4 | `POST /v1/auth/token` | 200 | 14 | `qa-a1515f53-f007-4141-8a21-28cd50d7c1ec` |
| 5 | `GET /v1/accounts/me` | 200 | 11 | `qa-42b455c3-76ff-4247-8b3f-7888e94d0403` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 9 | `qa-d78ad537-9a77-4bee-9772-4a46ee347e4f` |
| 7 | `POST /v1/auth/token` | 200 | 10 | `qa-7e70a2e0-5de8-4759-91c8-7f0860911e64` |
| 8 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-bd78195d-fcd0-499f-ba97-7b5599c14b5b` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-07dc56b7-9fe9-4895-b78b-1f58a61ce7c4` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-6ac4eb3e-d4f5-404a-94fd-8ccd75367742` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-007785ef-c8da-49a9-813f-f0d929bd3e9f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ee8f3440-a880-4c69-8530-6e47d674f4d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee8f3440-a880-4c69-8530-6e47d674f4d6
Content-Type: application/json

--- request body ---
{"handle":"qa-70b4e3da0130","displayName":"QA 70b4e3da0130","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee8f3440-a880-4c69-8530-6e47d674f4d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-70b4e3da0130
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fd5ddf7b-76b4-4318-99eb-fa77b03028e0","handle":"qa-70b4e3da0130","displayName":"QA 70b4e3da0130","region":"eu","role":"user","createdAt":"2026-11-24T12:38:04.914122539Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-62ee01b8-8880-4c4a-9950-9bfdb81e3123

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62ee01b8-8880-4c4a-9950-9bfdb81e3123
Content-Type: application/json

--- request body ---
{"handle":"qa-2dcd179c81f7","displayName":"QA 2dcd179c81f7","password":"****","region":"us"}

--- response: 201 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-62ee01b8-8880-4c4a-9950-9bfdb81e3123
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Location: /v1/accounts/qa-2dcd179c81f7
X-Served-Region: us
Content-Length: 181

{"id":"acc_e94bdef9-cc5e-47dd-984b-0feffca4ee60","handle":"qa-2dcd179c81f7","displayName":"QA 2dcd179c81f7","region":"us","role":"user","createdAt":"2026-11-24T12:38:04.940448037Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bf044e8e-389d-4007-81fe-6795d91421a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf044e8e-389d-4007-81fe-6795d91421a8
Content-Type: application/json

--- request body ---
{"handle":"qa-70b4e3da0130","password":"****"}

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf044e8e-389d-4007-81fe-6795d91421a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fd5ddf7b-76b4-4318-99eb-fa77b03028e0"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-a1515f53-f007-4141-8a21-28cd50d7c1ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1515f53-f007-4141-8a21-28cd50d7c1ec
Content-Type: application/json

--- request body ---
{"handle":"qa-70b4e3da0130","password":"****"}

--- response: 200 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1515f53-f007-4141-8a21-28cd50d7c1ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fd5ddf7b-76b4-4318-99eb-fa77b03028e0"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-42b455c3-76ff-4247-8b3f-7888e94d0403

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42b455c3-76ff-4247-8b3f-7888e94d0403
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-42b455c3-76ff-4247-8b3f-7888e94d0403
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
Content-Length: 181

{"id":"acc_fd5ddf7b-76b4-4318-99eb-fa77b03028e0","handle":"qa-70b4e3da0130","displayName":"QA 70b4e3da0130","region":"eu","role":"user","createdAt":"2026-11-24T12:38:04.914122539Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-2dcd179c81f7
correlation: qa-d78ad537-9a77-4bee-9772-4a46ee347e4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d78ad537-9a77-4bee-9772-4a46ee347e4f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d78ad537-9a77-4bee-9772-4a46ee347e4f
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

{"handle":"qa-2dcd179c81f7","displayName":"QA 2dcd179c81f7","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-7e70a2e0-5de8-4759-91c8-7f0860911e64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e70a2e0-5de8-4759-91c8-7f0860911e64
Content-Type: application/json

--- request body ---
{"handle":"qa-2dcd179c81f7","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e70a2e0-5de8-4759-91c8-7f0860911e64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e94bdef9-cc5e-47dd-984b-0feffca4ee60"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bd78195d-fcd0-499f-ba97-7b5599c14b5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd78195d-fcd0-499f-ba97-7b5599c14b5b
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bd78195d-fcd0-499f-ba97-7b5599c14b5b
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
correlation: qa-07dc56b7-9fe9-4895-b78b-1f58a61ce7c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07dc56b7-9fe9-4895-b78b-1f58a61ce7c4
Content-Type: application/json

--- request body ---
{"handle":"qa-2dcd179c81f7","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-07dc56b7-9fe9-4895-b78b-1f58a61ce7c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-07dc56b7-9fe9-4895-b78b-1f58a61ce7c4"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6ac4eb3e-d4f5-404a-94fd-8ccd75367742

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ac4eb3e-d4f5-404a-94fd-8ccd75367742
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6ac4eb3e-d4f5-404a-94fd-8ccd75367742
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-007785ef-c8da-49a9-813f-f0d929bd3e9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-007785ef-c8da-49a9-813f-f0d929bd3e9f
Content-Type: application/json

--- request body ---
{"handle":"qa-70b4e3da0130","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-007785ef-c8da-49a9-813f-f0d929bd3e9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-007785ef-c8da-49a9-813f-f0d929bd3e9f"}
```
