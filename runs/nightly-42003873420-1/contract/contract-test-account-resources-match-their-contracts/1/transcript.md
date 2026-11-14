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
| 1 | `POST /v1/accounts` | 201 | 499 | `qa-cd6b4293-0354-421a-b4db-26be89afc476` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-0804cb05-da0e-4bf1-8364-7eefe2e310c6` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-0eb4c5cc-c48e-4ef6-8f03-7ee1f5fae64d` |
| 4 | `POST /v1/auth/token` | 200 | 31 | `qa-c477384d-89cc-4174-a104-11afd89c974d` |
| 5 | `GET /v1/accounts/me` | 200 | 8 | `qa-bd62bff3-6f7d-4821-99a1-e3fc6937daa6` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 52 | `qa-b2a1bf88-2746-4a26-8156-68521069340a` |
| 7 | `POST /v1/auth/token` | 200 | 16 | `qa-f02ea39c-1cb4-4ce2-853f-3293c7a08636` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-1962d606-0753-42a7-87c4-f06554947ffe` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-4dbdb028-9908-4693-88ae-4a47459aed71` |
| 10 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-8e850912-c84a-4b35-9375-a34c34134d5c` |
| 11 | `POST /v1/auth/token` | 401 | 17 | `qa-e49b1c70-64d6-40eb-82b5-f6a394c0d559` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cd6b4293-0354-421a-b4db-26be89afc476

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd6b4293-0354-421a-b4db-26be89afc476
Content-Type: application/json

--- request body ---
{"handle":"qa-990958c33915","displayName":"QA 990958c33915","password":"****","region":"eu"}

--- response: 201 in 499 ms ---
Date: Thu, 05 Nov 2026 09:37:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd6b4293-0354-421a-b4db-26be89afc476
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
Location: /v1/accounts/qa-990958c33915
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a7da3e1d-b5bf-49d5-8522-d42764833dcf","handle":"qa-990958c33915","displayName":"QA 990958c33915","region":"eu","role":"user","createdAt":"2026-11-05T09:37:49.785841975Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0804cb05-da0e-4bf1-8364-7eefe2e310c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0804cb05-da0e-4bf1-8364-7eefe2e310c6
Content-Type: application/json

--- request body ---
{"handle":"qa-94c88b9eeeb0","displayName":"QA 94c88b9eeeb0","password":"****","region":"us"}

--- response: 201 in 32 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-0804cb05-da0e-4bf1-8364-7eefe2e310c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-94c88b9eeeb0
X-Served-Region: us
Content-Length: 181

{"id":"acc_f126d251-a258-4d28-aecf-99709d14c3a9","handle":"qa-94c88b9eeeb0","displayName":"QA 94c88b9eeeb0","region":"us","role":"user","createdAt":"2026-11-05T09:37:50.327190102Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0eb4c5cc-c48e-4ef6-8f03-7ee1f5fae64d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0eb4c5cc-c48e-4ef6-8f03-7ee1f5fae64d
Content-Type: application/json

--- request body ---
{"handle":"qa-990958c33915","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-0eb4c5cc-c48e-4ef6-8f03-7ee1f5fae64d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7da3e1d-b5bf-49d5-8522-d42764833dcf"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c477384d-89cc-4174-a104-11afd89c974d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c477384d-89cc-4174-a104-11afd89c974d
Content-Type: application/json

--- request body ---
{"handle":"qa-990958c33915","password":"****"}

--- response: 200 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-c477384d-89cc-4174-a104-11afd89c974d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7da3e1d-b5bf-49d5-8522-d42764833dcf"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd62bff3-6f7d-4821-99a1-e3fc6937daa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd62bff3-6f7d-4821-99a1-e3fc6937daa6
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd62bff3-6f7d-4821-99a1-e3fc6937daa6
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

{"id":"acc_a7da3e1d-b5bf-49d5-8522-d42764833dcf","handle":"qa-990958c33915","displayName":"QA 990958c33915","region":"eu","role":"user","createdAt":"2026-11-05T09:37:49.785841975Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-94c88b9eeeb0
correlation: qa-b2a1bf88-2746-4a26-8156-68521069340a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2a1bf88-2746-4a26-8156-68521069340a
Content-Type: application/json

--- response: 200 in 52 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2a1bf88-2746-4a26-8156-68521069340a
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

{"handle":"qa-94c88b9eeeb0","displayName":"QA 94c88b9eeeb0","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-f02ea39c-1cb4-4ce2-853f-3293c7a08636

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f02ea39c-1cb4-4ce2-853f-3293c7a08636
Content-Type: application/json

--- request body ---
{"handle":"qa-94c88b9eeeb0","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-f02ea39c-1cb4-4ce2-853f-3293c7a08636
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f126d251-a258-4d28-aecf-99709d14c3a9"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1962d606-0753-42a7-87c4-f06554947ffe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1962d606-0753-42a7-87c4-f06554947ffe
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1962d606-0753-42a7-87c4-f06554947ffe
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
correlation: qa-4dbdb028-9908-4693-88ae-4a47459aed71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dbdb028-9908-4693-88ae-4a47459aed71
Content-Type: application/json

--- request body ---
{"handle":"qa-94c88b9eeeb0","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4dbdb028-9908-4693-88ae-4a47459aed71
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4dbdb028-9908-4693-88ae-4a47459aed71"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e850912-c84a-4b35-9375-a34c34134d5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e850912-c84a-4b35-9375-a34c34134d5c
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e850912-c84a-4b35-9375-a34c34134d5c
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
correlation: qa-e49b1c70-64d6-40eb-82b5-f6a394c0d559

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e49b1c70-64d6-40eb-82b5-f6a394c0d559
Content-Type: application/json

--- request body ---
{"handle":"qa-990958c33915","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e49b1c70-64d6-40eb-82b5-f6a394c0d559
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e49b1c70-64d6-40eb-82b5-f6a394c0d559"}
```
