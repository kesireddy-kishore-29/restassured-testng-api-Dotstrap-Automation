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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-b5199b5d-9a75-4adc-9ef4-0ff0b87800c5` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-1e5ea52d-ab55-46eb-8476-23bb77f607ac` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-596e6c08-0d6b-4c9e-b8df-b6d98e41582c` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-44e73b37-6f69-44a1-8b87-81fd31d03a06` |
| 5 | `POST /v1/auth/token` | 422 | 41 | `qa-5e9b64b7-a8a0-4f70-95ab-5d2af9f60182` |
| 6 | `POST /v1/auth/token` | 200 | 74 | `qa-0057467b-34c7-437c-9482-acf230465684` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-5410d07c-98d7-48da-825c-f2065dcde32d` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-dc3a6e6a-f581-4c11-855b-cf739e37d934` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-839bdb40-6743-4f34-a02d-b141a83fbdb2` |
| 10 | `POST /v1/auth/token` | 401 | 34 | `qa-9ba90236-9859-40b9-be32-afe8ca6530a2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b5199b5d-9a75-4adc-9ef4-0ff0b87800c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5199b5d-9a75-4adc-9ef4-0ff0b87800c5
Content-Type: application/json

--- request body ---
{"handle":"qa-6f71908b6de4","displayName":"QA 6f71908b6de4","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5199b5d-9a75-4adc-9ef4-0ff0b87800c5
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
Location: /v1/accounts/qa-6f71908b6de4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bf1e8bff-3201-46d9-997b-128698ebee41","handle":"qa-6f71908b6de4","displayName":"QA 6f71908b6de4","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.846781137Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1e5ea52d-ab55-46eb-8476-23bb77f607ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e5ea52d-ab55-46eb-8476-23bb77f607ac
Content-Type: application/json

--- request body ---
{"handle":"qa-75648f9e4caa","displayName":"QA 75648f9e4caa","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e5ea52d-ab55-46eb-8476-23bb77f607ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Location: /v1/accounts/qa-75648f9e4caa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0bd6507d-d46f-46fd-8204-4006cd0e62d2","handle":"qa-75648f9e4caa","displayName":"QA 75648f9e4caa","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.921849568Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-596e6c08-0d6b-4c9e-b8df-b6d98e41582c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-596e6c08-0d6b-4c9e-b8df-b6d98e41582c
Content-Type: application/json

--- request body ---
{"handle":"qa-6f71908b6de4","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-596e6c08-0d6b-4c9e-b8df-b6d98e41582c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bf1e8bff-3201-46d9-997b-128698ebee41"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-44e73b37-6f69-44a1-8b87-81fd31d03a06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44e73b37-6f69-44a1-8b87-81fd31d03a06
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-75648f9e4caa","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-44e73b37-6f69-44a1-8b87-81fd31d03a06
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
Location: /v1/conversations/cnv_7b10cf6c-0c77-4ae7-8673-044353c0f974
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7b10cf6c-0c77-4ae7-8673-044353c0f974","subject":"Error contract","status":"open","region":"eu","participants":["qa-6f71908b6de4","qa-75648f9e4caa"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:53.982714016Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-5e9b64b7-a8a0-4f70-95ab-5d2af9f60182

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e9b64b7-a8a0-4f70-95ab-5d2af9f60182
Content-Type: application/json

--- request body ---
{"handle":"qa-6f71908b6de4","password":"****","ttlSeconds":0}

--- response: 422 in 41 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5e9b64b7-a8a0-4f70-95ab-5d2af9f60182
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-5e9b64b7-a8a0-4f70-95ab-5d2af9f60182","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0057467b-34c7-437c-9482-acf230465684

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0057467b-34c7-437c-9482-acf230465684
Content-Type: application/json

--- request body ---
{"handle":"qa-75648f9e4caa","password":"****"}

--- response: 200 in 74 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-0057467b-34c7-437c-9482-acf230465684
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bd6507d-d46f-46fd-8204-4006cd0e62d2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5410d07c-98d7-48da-825c-f2065dcde32d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5410d07c-98d7-48da-825c-f2065dcde32d
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5410d07c-98d7-48da-825c-f2065dcde32d
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
correlation: qa-dc3a6e6a-f581-4c11-855b-cf739e37d934

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc3a6e6a-f581-4c11-855b-cf739e37d934
Content-Type: application/json

--- request body ---
{"handle":"qa-75648f9e4caa","password":"****"}

--- response: 401 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc3a6e6a-f581-4c11-855b-cf739e37d934
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dc3a6e6a-f581-4c11-855b-cf739e37d934"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-839bdb40-6743-4f34-a02d-b141a83fbdb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-839bdb40-6743-4f34-a02d-b141a83fbdb2
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-839bdb40-6743-4f34-a02d-b141a83fbdb2
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
correlation: qa-9ba90236-9859-40b9-be32-afe8ca6530a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ba90236-9859-40b9-be32-afe8ca6530a2
Content-Type: application/json

--- request body ---
{"handle":"qa-6f71908b6de4","password":"****"}

--- response: 401 in 34 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ba90236-9859-40b9-be32-afe8ca6530a2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9ba90236-9859-40b9-be32-afe8ca6530a2"}
```
