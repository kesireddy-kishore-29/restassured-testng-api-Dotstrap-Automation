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
| 1 | `POST /v1/accounts` | 201 | 300 | `qa-99e646d2-be8e-4573-93a7-5007f7f97452` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-d51efbfc-2e4e-4f2c-a63a-cd73786a1630` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-d42be099-37a5-4081-ac36-f5d560e6a1ee` |
| 4 | `POST /v1/auth/token` | 200 | 19 | `qa-5069dda4-5f45-4ba4-844f-ef25b8dd2d35` |
| 5 | `GET /v1/accounts/me` | 200 | 18 | `qa-d05c5916-bee1-4fbc-9af9-3151620040e7` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 36 | `qa-8c9b8cc8-75b4-44b7-af1a-eee01d227bec` |
| 7 | `POST /v1/auth/token` | 200 | 13 | `qa-f38f4f94-1a0b-491e-8be4-12bf9a34c17c` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-24c23466-ba9f-4082-8e33-4cd45ad69cd5` |
| 9 | `POST /v1/auth/token` | 401 | 13 | `qa-c6014b8b-3341-4e9b-95e2-e2b07e2a0c8e` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-88e6e9f2-c179-47f5-8cae-fdc1e6eecebe` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-e3b5875d-5804-41fe-a57a-6d477016628b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-99e646d2-be8e-4573-93a7-5007f7f97452

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99e646d2-be8e-4573-93a7-5007f7f97452
Content-Type: application/json

--- request body ---
{"handle":"qa-8f3da2b73cde","displayName":"QA 8f3da2b73cde","password":"****","region":"eu"}

--- response: 201 in 300 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-99e646d2-be8e-4573-93a7-5007f7f97452
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-8f3da2b73cde
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8e8d457a-7197-4fa1-b5c2-6e99cbbd65a4","handle":"qa-8f3da2b73cde","displayName":"QA 8f3da2b73cde","region":"eu","role":"user","createdAt":"2026-11-02T09:38:44.650067191Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d51efbfc-2e4e-4f2c-a63a-cd73786a1630

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d51efbfc-2e4e-4f2c-a63a-cd73786a1630
Content-Type: application/json

--- request body ---
{"handle":"qa-44400953ce3f","displayName":"QA 44400953ce3f","password":"****","region":"us"}

--- response: 201 in 36 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-d51efbfc-2e4e-4f2c-a63a-cd73786a1630
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-44400953ce3f
X-Served-Region: us
Content-Length: 181

{"id":"acc_79fd90a0-2505-418e-addd-3fe351b85944","handle":"qa-44400953ce3f","displayName":"QA 44400953ce3f","region":"us","role":"user","createdAt":"2026-11-02T09:38:44.940366175Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d42be099-37a5-4081-ac36-f5d560e6a1ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d42be099-37a5-4081-ac36-f5d560e6a1ee
Content-Type: application/json

--- request body ---
{"handle":"qa-8f3da2b73cde","password":"****"}

--- response: 200 in 29 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-d42be099-37a5-4081-ac36-f5d560e6a1ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8e8d457a-7197-4fa1-b5c2-6e99cbbd65a4"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-5069dda4-5f45-4ba4-844f-ef25b8dd2d35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5069dda4-5f45-4ba4-844f-ef25b8dd2d35
Content-Type: application/json

--- request body ---
{"handle":"qa-8f3da2b73cde","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-5069dda4-5f45-4ba4-844f-ef25b8dd2d35
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8e8d457a-7197-4fa1-b5c2-6e99cbbd65a4"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-d05c5916-bee1-4fbc-9af9-3151620040e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d05c5916-bee1-4fbc-9af9-3151620040e7
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d05c5916-bee1-4fbc-9af9-3151620040e7
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

{"id":"acc_8e8d457a-7197-4fa1-b5c2-6e99cbbd65a4","handle":"qa-8f3da2b73cde","displayName":"QA 8f3da2b73cde","region":"eu","role":"user","createdAt":"2026-11-02T09:38:44.650067191Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-44400953ce3f
correlation: qa-8c9b8cc8-75b4-44b7-af1a-eee01d227bec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c9b8cc8-75b4-44b7-af1a-eee01d227bec
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c9b8cc8-75b4-44b7-af1a-eee01d227bec
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

{"handle":"qa-44400953ce3f","displayName":"QA 44400953ce3f","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-f38f4f94-1a0b-491e-8be4-12bf9a34c17c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f38f4f94-1a0b-491e-8be4-12bf9a34c17c
Content-Type: application/json

--- request body ---
{"handle":"qa-44400953ce3f","password":"****"}

--- response: 200 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-f38f4f94-1a0b-491e-8be4-12bf9a34c17c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_79fd90a0-2505-418e-addd-3fe351b85944"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-24c23466-ba9f-4082-8e33-4cd45ad69cd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24c23466-ba9f-4082-8e33-4cd45ad69cd5
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-24c23466-ba9f-4082-8e33-4cd45ad69cd5
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
correlation: qa-c6014b8b-3341-4e9b-95e2-e2b07e2a0c8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6014b8b-3341-4e9b-95e2-e2b07e2a0c8e
Content-Type: application/json

--- request body ---
{"handle":"qa-44400953ce3f","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c6014b8b-3341-4e9b-95e2-e2b07e2a0c8e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c6014b8b-3341-4e9b-95e2-e2b07e2a0c8e"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-88e6e9f2-c179-47f5-8cae-fdc1e6eecebe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88e6e9f2-c179-47f5-8cae-fdc1e6eecebe
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-88e6e9f2-c179-47f5-8cae-fdc1e6eecebe
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
correlation: qa-e3b5875d-5804-41fe-a57a-6d477016628b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3b5875d-5804-41fe-a57a-6d477016628b
Content-Type: application/json

--- request body ---
{"handle":"qa-8f3da2b73cde","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e3b5875d-5804-41fe-a57a-6d477016628b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e3b5875d-5804-41fe-a57a-6d477016628b"}
```
