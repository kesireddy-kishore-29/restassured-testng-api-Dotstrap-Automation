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
| 1 | `POST /v1/accounts` | 201 | 464 | `qa-01ec2b8c-9314-4ef3-ae87-b3b5e46bdfb4` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-ddcdc09f-b74e-4671-8f8b-7c53f20965a4` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-85b99f54-f094-4dae-a42b-74576f3b256c` |
| 4 | `POST /v1/auth/token` | 200 | 26 | `qa-ce8b6300-2544-4082-85e3-b32590d26ab8` |
| 5 | `GET /v1/accounts/me` | 200 | 19 | `qa-aa61fd34-64ea-4c94-98fd-f77ef9f6a2a3` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 32 | `qa-6a8f9901-7863-4514-b0f3-732c6b14e803` |
| 7 | `POST /v1/auth/token` | 200 | 29 | `qa-a3ade552-9fc6-4473-91a1-4282467a81c3` |
| 8 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-35d7e7cf-779d-43f0-a1db-9f9a7354c45d` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-56b82f6f-257f-42b7-815e-e6871b1bf3e9` |
| 10 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-e1637082-6dc3-4da4-aec9-cd7c262976e0` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-eed34c9c-24b7-46d9-9a0b-cb3b9c05d865` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-01ec2b8c-9314-4ef3-ae87-b3b5e46bdfb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01ec2b8c-9314-4ef3-ae87-b3b5e46bdfb4
Content-Type: application/json

--- request body ---
{"handle":"qa-6d5c627356dd","displayName":"QA 6d5c627356dd","password":"****","region":"eu"}

--- response: 201 in 464 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-01ec2b8c-9314-4ef3-ae87-b3b5e46bdfb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-6d5c627356dd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_19bc49a5-4e2c-4f76-982d-28ecdc496260","handle":"qa-6d5c627356dd","displayName":"QA 6d5c627356dd","region":"eu","role":"user","createdAt":"2026-11-10T09:59:38.189688325Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ddcdc09f-b74e-4671-8f8b-7c53f20965a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddcdc09f-b74e-4671-8f8b-7c53f20965a4
Content-Type: application/json

--- request body ---
{"handle":"qa-22c04c74e82f","displayName":"QA 22c04c74e82f","password":"****","region":"us"}

--- response: 201 in 43 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddcdc09f-b74e-4671-8f8b-7c53f20965a4
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
Location: /v1/accounts/qa-22c04c74e82f
X-Served-Region: us
Content-Length: 181

{"id":"acc_e97cb7d7-f848-47ca-88ca-c710f68a1eea","handle":"qa-22c04c74e82f","displayName":"QA 22c04c74e82f","region":"us","role":"user","createdAt":"2026-11-10T09:59:38.640883875Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-85b99f54-f094-4dae-a42b-74576f3b256c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85b99f54-f094-4dae-a42b-74576f3b256c
Content-Type: application/json

--- request body ---
{"handle":"qa-6d5c627356dd","password":"****"}

--- response: 200 in 50 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-85b99f54-f094-4dae-a42b-74576f3b256c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_19bc49a5-4e2c-4f76-982d-28ecdc496260"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ce8b6300-2544-4082-85e3-b32590d26ab8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce8b6300-2544-4082-85e3-b32590d26ab8
Content-Type: application/json

--- request body ---
{"handle":"qa-6d5c627356dd","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce8b6300-2544-4082-85e3-b32590d26ab8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_19bc49a5-4e2c-4f76-982d-28ecdc496260"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-aa61fd34-64ea-4c94-98fd-f77ef9f6a2a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa61fd34-64ea-4c94-98fd-f77ef9f6a2a3
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa61fd34-64ea-4c94-98fd-f77ef9f6a2a3
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

{"id":"acc_19bc49a5-4e2c-4f76-982d-28ecdc496260","handle":"qa-6d5c627356dd","displayName":"QA 6d5c627356dd","region":"eu","role":"user","createdAt":"2026-11-10T09:59:38.189688325Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-22c04c74e82f
correlation: qa-6a8f9901-7863-4514-b0f3-732c6b14e803

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a8f9901-7863-4514-b0f3-732c6b14e803
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a8f9901-7863-4514-b0f3-732c6b14e803
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

{"handle":"qa-22c04c74e82f","displayName":"QA 22c04c74e82f","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-a3ade552-9fc6-4473-91a1-4282467a81c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3ade552-9fc6-4473-91a1-4282467a81c3
Content-Type: application/json

--- request body ---
{"handle":"qa-22c04c74e82f","password":"****"}

--- response: 200 in 29 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3ade552-9fc6-4473-91a1-4282467a81c3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e97cb7d7-f848-47ca-88ca-c710f68a1eea"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35d7e7cf-779d-43f0-a1db-9f9a7354c45d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35d7e7cf-779d-43f0-a1db-9f9a7354c45d
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35d7e7cf-779d-43f0-a1db-9f9a7354c45d
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
correlation: qa-56b82f6f-257f-42b7-815e-e6871b1bf3e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56b82f6f-257f-42b7-815e-e6871b1bf3e9
Content-Type: application/json

--- request body ---
{"handle":"qa-22c04c74e82f","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-56b82f6f-257f-42b7-815e-e6871b1bf3e9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-56b82f6f-257f-42b7-815e-e6871b1bf3e9"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e1637082-6dc3-4da4-aec9-cd7c262976e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1637082-6dc3-4da4-aec9-cd7c262976e0
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e1637082-6dc3-4da4-aec9-cd7c262976e0
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
correlation: qa-eed34c9c-24b7-46d9-9a0b-cb3b9c05d865

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eed34c9c-24b7-46d9-9a0b-cb3b9c05d865
Content-Type: application/json

--- request body ---
{"handle":"qa-6d5c627356dd","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eed34c9c-24b7-46d9-9a0b-cb3b9c05d865
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eed34c9c-24b7-46d9-9a0b-cb3b9c05d865"}
```
