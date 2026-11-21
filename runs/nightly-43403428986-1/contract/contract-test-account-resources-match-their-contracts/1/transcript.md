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
| 1 | `POST /v1/accounts` | 201 | 498 | `qa-de474f28-6279-422f-9db0-de53b753a0bf` |
| 2 | `POST /v1/accounts` | 201 | 81 | `qa-2f58244a-ea50-451e-8178-cc307eec6fd6` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-e5aed2db-08af-428e-b87d-d3d5883c85b1` |
| 4 | `POST /v1/auth/token` | 200 | 55 | `qa-a07cae74-dc8a-40f6-93e1-55d6efeaa353` |
| 5 | `GET /v1/accounts/me` | 200 | 30 | `qa-86f8b70c-d7bc-498d-addc-970db29f4415` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 45 | `qa-b376cd0e-de3e-4f79-9a1a-50cc6e7cb7f9` |
| 7 | `POST /v1/auth/token` | 200 | 26 | `qa-a9bfd203-cf09-4ba7-8443-1cc4363d00c4` |
| 8 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-467633c1-a580-4523-9f72-231a2be2c604` |
| 9 | `POST /v1/auth/token` | 401 | 12 | `qa-74502740-c4f8-4372-a2a0-3d422de9b1e4` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-cee3c799-6ab6-4cd0-be64-0bccd7b144fb` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-25220cf8-b74e-4bcb-9b07-cb20c598b807` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-de474f28-6279-422f-9db0-de53b753a0bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de474f28-6279-422f-9db0-de53b753a0bf
Content-Type: application/json

--- request body ---
{"handle":"qa-9984e8f9e98e","displayName":"QA 9984e8f9e98e","password":"****","region":"eu"}

--- response: 201 in 498 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-de474f28-6279-422f-9db0-de53b753a0bf
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
Location: /v1/accounts/qa-9984e8f9e98e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b55ac3e2-1333-466f-8265-3dc5c1ad7150","handle":"qa-9984e8f9e98e","displayName":"QA 9984e8f9e98e","region":"eu","role":"user","createdAt":"2026-11-13T09:42:10.033857966Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2f58244a-ea50-451e-8178-cc307eec6fd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f58244a-ea50-451e-8178-cc307eec6fd6
Content-Type: application/json

--- request body ---
{"handle":"qa-f0ff7590c0a1","displayName":"QA f0ff7590c0a1","password":"****","region":"us"}

--- response: 201 in 81 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f58244a-ea50-451e-8178-cc307eec6fd6
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
Location: /v1/accounts/qa-f0ff7590c0a1
X-Served-Region: us
Content-Length: 181

{"id":"acc_5aaa440a-5acc-4fca-95a1-49cdb6bec16c","handle":"qa-f0ff7590c0a1","displayName":"QA f0ff7590c0a1","region":"us","role":"user","createdAt":"2026-11-13T09:42:10.484054194Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e5aed2db-08af-428e-b87d-d3d5883c85b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5aed2db-08af-428e-b87d-d3d5883c85b1
Content-Type: application/json

--- request body ---
{"handle":"qa-9984e8f9e98e","password":"****"}

--- response: 200 in 43 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5aed2db-08af-428e-b87d-d3d5883c85b1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b55ac3e2-1333-466f-8265-3dc5c1ad7150"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-a07cae74-dc8a-40f6-93e1-55d6efeaa353

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a07cae74-dc8a-40f6-93e1-55d6efeaa353
Content-Type: application/json

--- request body ---
{"handle":"qa-9984e8f9e98e","password":"****"}

--- response: 200 in 55 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a07cae74-dc8a-40f6-93e1-55d6efeaa353
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b55ac3e2-1333-466f-8265-3dc5c1ad7150"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-86f8b70c-d7bc-498d-addc-970db29f4415

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86f8b70c-d7bc-498d-addc-970db29f4415
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-86f8b70c-d7bc-498d-addc-970db29f4415
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

{"id":"acc_b55ac3e2-1333-466f-8265-3dc5c1ad7150","handle":"qa-9984e8f9e98e","displayName":"QA 9984e8f9e98e","region":"eu","role":"user","createdAt":"2026-11-13T09:42:10.033857966Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-f0ff7590c0a1
correlation: qa-b376cd0e-de3e-4f79-9a1a-50cc6e7cb7f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b376cd0e-de3e-4f79-9a1a-50cc6e7cb7f9
Content-Type: application/json

--- response: 200 in 45 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-b376cd0e-de3e-4f79-9a1a-50cc6e7cb7f9
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

{"handle":"qa-f0ff7590c0a1","displayName":"QA f0ff7590c0a1","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-a9bfd203-cf09-4ba7-8443-1cc4363d00c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9bfd203-cf09-4ba7-8443-1cc4363d00c4
Content-Type: application/json

--- request body ---
{"handle":"qa-f0ff7590c0a1","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9bfd203-cf09-4ba7-8443-1cc4363d00c4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5aaa440a-5acc-4fca-95a1-49cdb6bec16c"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-467633c1-a580-4523-9f72-231a2be2c604

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-467633c1-a580-4523-9f72-231a2be2c604
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-467633c1-a580-4523-9f72-231a2be2c604
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
correlation: qa-74502740-c4f8-4372-a2a0-3d422de9b1e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74502740-c4f8-4372-a2a0-3d422de9b1e4
Content-Type: application/json

--- request body ---
{"handle":"qa-f0ff7590c0a1","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74502740-c4f8-4372-a2a0-3d422de9b1e4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-74502740-c4f8-4372-a2a0-3d422de9b1e4"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cee3c799-6ab6-4cd0-be64-0bccd7b144fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cee3c799-6ab6-4cd0-be64-0bccd7b144fb
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cee3c799-6ab6-4cd0-be64-0bccd7b144fb
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
correlation: qa-25220cf8-b74e-4bcb-9b07-cb20c598b807

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25220cf8-b74e-4bcb-9b07-cb20c598b807
Content-Type: application/json

--- request body ---
{"handle":"qa-9984e8f9e98e","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25220cf8-b74e-4bcb-9b07-cb20c598b807
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-25220cf8-b74e-4bcb-9b07-cb20c598b807"}
```
