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
| 1 | `POST /v1/accounts` | 201 | 347 | `qa-04d294c8-8d02-461c-aefe-557696c67fe2` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-92740829-7db1-46d5-983e-6c6cd6d974d6` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-3c0f5230-622e-4202-b205-1bfd3b706927` |
| 4 | `POST /v1/auth/token` | 200 | 24 | `qa-4dab9eb1-c33b-4616-bdf2-86a4a9c43bf2` |
| 5 | `GET /v1/accounts/me` | 200 | 18 | `qa-31ccc311-e3bb-4e96-bb5b-01dc66a48456` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 27 | `qa-ccdd7641-c248-438d-bef3-6d5cabe673b3` |
| 7 | `POST /v1/auth/token` | 200 | 19 | `qa-ed7e8dae-c73a-4be0-b346-82f3b737a89f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-bc2b7344-7bc0-435e-b128-5046483c6a6f` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-900d80a4-e803-46bd-887e-e0cb65c920ba` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-bfc5a555-55de-497d-8aae-6e35da8b59ea` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-9128d272-0911-4870-a17b-bfc9f069a916` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-04d294c8-8d02-461c-aefe-557696c67fe2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04d294c8-8d02-461c-aefe-557696c67fe2
Content-Type: application/json

--- request body ---
{"handle":"qa-79c89520f9f2","displayName":"QA 79c89520f9f2","password":"****","region":"eu"}

--- response: 201 in 347 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-04d294c8-8d02-461c-aefe-557696c67fe2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-79c89520f9f2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3427094c-16c2-471c-8411-bfa3b4ad57a1","handle":"qa-79c89520f9f2","displayName":"QA 79c89520f9f2","region":"eu","role":"user","createdAt":"2026-11-12T09:56:25.261086975Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-92740829-7db1-46d5-983e-6c6cd6d974d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92740829-7db1-46d5-983e-6c6cd6d974d6
Content-Type: application/json

--- request body ---
{"handle":"qa-fa6805e32d79","displayName":"QA fa6805e32d79","password":"****","region":"us"}

--- response: 201 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-92740829-7db1-46d5-983e-6c6cd6d974d6
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
Location: /v1/accounts/qa-fa6805e32d79
X-Served-Region: us
Content-Length: 181

{"id":"acc_6799bc53-1be2-44c2-895c-77b4592ebe7d","handle":"qa-fa6805e32d79","displayName":"QA fa6805e32d79","region":"us","role":"user","createdAt":"2026-11-12T09:56:25.584053288Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3c0f5230-622e-4202-b205-1bfd3b706927

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c0f5230-622e-4202-b205-1bfd3b706927
Content-Type: application/json

--- request body ---
{"handle":"qa-79c89520f9f2","password":"****"}

--- response: 200 in 43 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c0f5230-622e-4202-b205-1bfd3b706927
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3427094c-16c2-471c-8411-bfa3b4ad57a1"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-4dab9eb1-c33b-4616-bdf2-86a4a9c43bf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dab9eb1-c33b-4616-bdf2-86a4a9c43bf2
Content-Type: application/json

--- request body ---
{"handle":"qa-79c89520f9f2","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-4dab9eb1-c33b-4616-bdf2-86a4a9c43bf2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3427094c-16c2-471c-8411-bfa3b4ad57a1"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-31ccc311-e3bb-4e96-bb5b-01dc66a48456

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31ccc311-e3bb-4e96-bb5b-01dc66a48456
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-31ccc311-e3bb-4e96-bb5b-01dc66a48456
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

{"id":"acc_3427094c-16c2-471c-8411-bfa3b4ad57a1","handle":"qa-79c89520f9f2","displayName":"QA 79c89520f9f2","region":"eu","role":"user","createdAt":"2026-11-12T09:56:25.261086975Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-fa6805e32d79
correlation: qa-ccdd7641-c248-438d-bef3-6d5cabe673b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccdd7641-c248-438d-bef3-6d5cabe673b3
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-ccdd7641-c248-438d-bef3-6d5cabe673b3
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

{"handle":"qa-fa6805e32d79","displayName":"QA fa6805e32d79","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-ed7e8dae-c73a-4be0-b346-82f3b737a89f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed7e8dae-c73a-4be0-b346-82f3b737a89f
Content-Type: application/json

--- request body ---
{"handle":"qa-fa6805e32d79","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed7e8dae-c73a-4be0-b346-82f3b737a89f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6799bc53-1be2-44c2-895c-77b4592ebe7d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bc2b7344-7bc0-435e-b128-5046483c6a6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc2b7344-7bc0-435e-b128-5046483c6a6f
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bc2b7344-7bc0-435e-b128-5046483c6a6f
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
correlation: qa-900d80a4-e803-46bd-887e-e0cb65c920ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-900d80a4-e803-46bd-887e-e0cb65c920ba
Content-Type: application/json

--- request body ---
{"handle":"qa-fa6805e32d79","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-900d80a4-e803-46bd-887e-e0cb65c920ba
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-900d80a4-e803-46bd-887e-e0cb65c920ba"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bfc5a555-55de-497d-8aae-6e35da8b59ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfc5a555-55de-497d-8aae-6e35da8b59ea
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bfc5a555-55de-497d-8aae-6e35da8b59ea
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
correlation: qa-9128d272-0911-4870-a17b-bfc9f069a916

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9128d272-0911-4870-a17b-bfc9f069a916
Content-Type: application/json

--- request body ---
{"handle":"qa-79c89520f9f2","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9128d272-0911-4870-a17b-bfc9f069a916
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9128d272-0911-4870-a17b-bfc9f069a916"}
```
