# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-013fd268-57bd-4784-9f76-129bc64f82d2` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-762aae81-ef1d-4c4b-b694-ce313768be5a` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-5f8699d7-2f3d-4d20-ba73-096a96718e82` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-0063b2f8-dad7-43cf-8f86-52602ce013ab` |
| 5 | `POST /v1/accounts` | 400 | 12 | `qa-bbd68f1b-b760-4f00-844a-a14d8f186195` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-9b347c2f-0483-404a-ab5d-01efe25b6530` |
| 7 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-78f4098d-f881-444e-ae53-6b17a5936651` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-d08750c0-2c8d-4614-832a-40b8cf1d750d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-21da43d2-99a8-4380-b5f4-a76a04028028` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-9850d3c8-0381-4a1e-a70b-aa37383751b5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-013fd268-57bd-4784-9f76-129bc64f82d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-013fd268-57bd-4784-9f76-129bc64f82d2
Content-Type: application/json

--- request body ---
{"handle":"qa-b93cc8aa68d2","displayName":"QA b93cc8aa68d2","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-013fd268-57bd-4784-9f76-129bc64f82d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-b93cc8aa68d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f733ecdc-f76b-4b0e-ba76-70d359a81180","handle":"qa-b93cc8aa68d2","displayName":"QA b93cc8aa68d2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.721296127Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-762aae81-ef1d-4c4b-b694-ce313768be5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-762aae81-ef1d-4c4b-b694-ce313768be5a
Content-Type: application/json

--- request body ---
{"handle":"qa-eacfae741ef9","displayName":"QA eacfae741ef9","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-762aae81-ef1d-4c4b-b694-ce313768be5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Location: /v1/accounts/qa-eacfae741ef9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9137cebe-c1d5-4e3e-a849-46c3fd3483cf","handle":"qa-eacfae741ef9","displayName":"QA eacfae741ef9","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.742593897Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5f8699d7-2f3d-4d20-ba73-096a96718e82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f8699d7-2f3d-4d20-ba73-096a96718e82
Content-Type: application/json

--- request body ---
{"handle":"qa-b93cc8aa68d2","password":"****"}

--- response: 200 in 37 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f8699d7-2f3d-4d20-ba73-096a96718e82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f733ecdc-f76b-4b0e-ba76-70d359a81180"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0063b2f8-dad7-43cf-8f86-52602ce013ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0063b2f8-dad7-43cf-8f86-52602ce013ab
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-eacfae741ef9","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-0063b2f8-dad7-43cf-8f86-52602ce013ab
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
Location: /v1/conversations/cnv_8bf0b013-ef5c-422a-9c45-5f4e53a7feaf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8bf0b013-ef5c-422a-9c45-5f4e53a7feaf","subject":"Error contract","status":"open","region":"eu","participants":["qa-b93cc8aa68d2","qa-eacfae741ef9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.832810631Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-bbd68f1b-b760-4f00-844a-a14d8f186195

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbd68f1b-b760-4f00-844a-a14d8f186195
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bbd68f1b-b760-4f00-844a-a14d8f186195
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 10
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-bbd68f1b-b760-4f00-844a-a14d8f186195"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9b347c2f-0483-404a-ab5d-01efe25b6530

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b347c2f-0483-404a-ab5d-01efe25b6530
Content-Type: application/json

--- request body ---
{"handle":"qa-eacfae741ef9","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b347c2f-0483-404a-ab5d-01efe25b6530
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9137cebe-c1d5-4e3e-a849-46c3fd3483cf"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-78f4098d-f881-444e-ae53-6b17a5936651

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78f4098d-f881-444e-ae53-6b17a5936651
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-78f4098d-f881-444e-ae53-6b17a5936651
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
correlation: qa-d08750c0-2c8d-4614-832a-40b8cf1d750d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d08750c0-2c8d-4614-832a-40b8cf1d750d
Content-Type: application/json

--- request body ---
{"handle":"qa-eacfae741ef9","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d08750c0-2c8d-4614-832a-40b8cf1d750d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d08750c0-2c8d-4614-832a-40b8cf1d750d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21da43d2-99a8-4380-b5f4-a76a04028028

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21da43d2-99a8-4380-b5f4-a76a04028028
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-21da43d2-99a8-4380-b5f4-a76a04028028
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9850d3c8-0381-4a1e-a70b-aa37383751b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9850d3c8-0381-4a1e-a70b-aa37383751b5
Content-Type: application/json

--- request body ---
{"handle":"qa-b93cc8aa68d2","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9850d3c8-0381-4a1e-a70b-aa37383751b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9850d3c8-0381-4a1e-a70b-aa37383751b5"}
```
