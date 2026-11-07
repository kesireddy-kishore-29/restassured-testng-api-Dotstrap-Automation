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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-e2a9765d-681d-42b8-89f8-d3f887eacefa` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-dbe637ef-3c18-468c-b8e0-80b3f93ae967` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-e006cb52-f461-4d4b-a51f-1bd0ecd3cf08` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 21 | `qa-57bd05df-ef3c-49a7-b435-f3f0cb3a8010` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 16 | `qa-d184afa5-8536-46ec-8573-cee93b0de741` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 7 | `qa-6ecc113e-608a-49fd-8fd1-12e6f97f1749` |
| 7 | `POST /v1/auth/token` | 200 | 18 | `qa-33858032-6446-4067-a2e8-26541f18bc26` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-31d6770a-0aae-4386-b9a3-6e26bb8abb55` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-a8878a46-aa15-4757-a4d1-f8c9e9e1db5c` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-9445b1e0-14d4-4c7e-8c09-0b7b532c1e3a` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-bd30a9ab-90c3-4752-bfb6-96b9aa18734b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e2a9765d-681d-42b8-89f8-d3f887eacefa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2a9765d-681d-42b8-89f8-d3f887eacefa
Content-Type: application/json

--- request body ---
{"handle":"qa-b72630f169bf","displayName":"QA b72630f169bf","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2a9765d-681d-42b8-89f8-d3f887eacefa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-b72630f169bf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5519b94f-d590-4a92-8f44-95d87c9dccb8","handle":"qa-b72630f169bf","displayName":"QA b72630f169bf","region":"eu","role":"user","createdAt":"2026-11-04T09:28:15.233145777Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dbe637ef-3c18-468c-b8e0-80b3f93ae967

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbe637ef-3c18-468c-b8e0-80b3f93ae967
Content-Type: application/json

--- request body ---
{"handle":"qa-759c6dd70242","displayName":"QA 759c6dd70242","password":"****","region":"us"}

--- response: 201 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbe637ef-3c18-468c-b8e0-80b3f93ae967
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-759c6dd70242
X-Served-Region: us
Content-Length: 181

{"id":"acc_eabdf5a2-527b-496f-bb20-dfe82ce38f74","handle":"qa-759c6dd70242","displayName":"QA 759c6dd70242","region":"us","role":"user","createdAt":"2026-11-04T09:28:15.260363209Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e006cb52-f461-4d4b-a51f-1bd0ecd3cf08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e006cb52-f461-4d4b-a51f-1bd0ecd3cf08
Content-Type: application/json

--- request body ---
{"handle":"qa-b72630f169bf","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e006cb52-f461-4d4b-a51f-1bd0ecd3cf08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5519b94f-d590-4a92-8f44-95d87c9dccb8"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-759c6dd70242
correlation: qa-57bd05df-ef3c-49a7-b435-f3f0cb3a8010

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57bd05df-ef3c-49a7-b435-f3f0cb3a8010
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-57bd05df-ef3c-49a7-b435-f3f0cb3a8010
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

{"handle":"qa-759c6dd70242","displayName":"QA 759c6dd70242","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-759c6dd70242
correlation: qa-d184afa5-8536-46ec-8573-cee93b0de741

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d184afa5-8536-46ec-8573-cee93b0de741
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d184afa5-8536-46ec-8573-cee93b0de741
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

{"handle":"qa-759c6dd70242","displayName":"QA 759c6dd70242","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-759c6dd70242
correlation: qa-6ecc113e-608a-49fd-8fd1-12e6f97f1749

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ecc113e-608a-49fd-8fd1-12e6f97f1749
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ecc113e-608a-49fd-8fd1-12e6f97f1749
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

{"handle":"qa-759c6dd70242","displayName":"QA 759c6dd70242","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-33858032-6446-4067-a2e8-26541f18bc26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33858032-6446-4067-a2e8-26541f18bc26
Content-Type: application/json

--- request body ---
{"handle":"qa-759c6dd70242","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-33858032-6446-4067-a2e8-26541f18bc26
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eabdf5a2-527b-496f-bb20-dfe82ce38f74"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-31d6770a-0aae-4386-b9a3-6e26bb8abb55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31d6770a-0aae-4386-b9a3-6e26bb8abb55
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-31d6770a-0aae-4386-b9a3-6e26bb8abb55
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
correlation: qa-a8878a46-aa15-4757-a4d1-f8c9e9e1db5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8878a46-aa15-4757-a4d1-f8c9e9e1db5c
Content-Type: application/json

--- request body ---
{"handle":"qa-759c6dd70242","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8878a46-aa15-4757-a4d1-f8c9e9e1db5c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a8878a46-aa15-4757-a4d1-f8c9e9e1db5c"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9445b1e0-14d4-4c7e-8c09-0b7b532c1e3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9445b1e0-14d4-4c7e-8c09-0b7b532c1e3a
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9445b1e0-14d4-4c7e-8c09-0b7b532c1e3a
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
correlation: qa-bd30a9ab-90c3-4752-bfb6-96b9aa18734b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd30a9ab-90c3-4752-bfb6-96b9aa18734b
Content-Type: application/json

--- request body ---
{"handle":"qa-b72630f169bf","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd30a9ab-90c3-4752-bfb6-96b9aa18734b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bd30a9ab-90c3-4752-bfb6-96b9aa18734b"}
```
