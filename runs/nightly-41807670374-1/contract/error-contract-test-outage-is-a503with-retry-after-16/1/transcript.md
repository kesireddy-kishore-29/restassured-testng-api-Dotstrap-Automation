# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-0ccccdc0-fe81-4bc7-a952-3e7a3a06a3cc` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-d2be36cf-64c3-48b0-ace1-80c8ade2c99f` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-e933a05f-7a51-4a92-87aa-40010b66cd86` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-68f0d705-c899-4b25-a36c-38cb5f09bdd5` |
| 5 | `GET /v1/admin/stats` | 503 | 5 | `qa-65e888a3-cae5-4b06-8e32-f89c5578b357` |
| 6 | `POST /v1/auth/token` | 200 | 7 | `qa-a752350f-8bfd-4655-a4ab-cda6a615b0b4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-317cf8b1-e22b-4e3d-8fa2-368eda3eff4c` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-09722c99-1b22-40ed-ac66-8501f6eef950` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e6df5671-0adc-45e6-824b-0dcbd1d1ea17` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-5091ea7c-1a94-4dc8-81aa-d7e7a0aa4642` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0ccccdc0-fe81-4bc7-a952-3e7a3a06a3cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ccccdc0-fe81-4bc7-a952-3e7a3a06a3cc
Content-Type: application/json

--- request body ---
{"handle":"qa-2f34edc22511","displayName":"QA 2f34edc22511","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ccccdc0-fe81-4bc7-a952-3e7a3a06a3cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 8
Location: /v1/accounts/qa-2f34edc22511
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f070ae46-4209-4863-b90d-116daa3f9b15","handle":"qa-2f34edc22511","displayName":"QA 2f34edc22511","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.477184336Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d2be36cf-64c3-48b0-ace1-80c8ade2c99f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2be36cf-64c3-48b0-ace1-80c8ade2c99f
Content-Type: application/json

--- request body ---
{"handle":"qa-6129d77e85e7","displayName":"QA 6129d77e85e7","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2be36cf-64c3-48b0-ace1-80c8ade2c99f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 8
Location: /v1/accounts/qa-6129d77e85e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6fd4928d-7ff9-4238-b9ce-3f176a3e82f3","handle":"qa-6129d77e85e7","displayName":"QA 6129d77e85e7","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.513671811Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e933a05f-7a51-4a92-87aa-40010b66cd86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e933a05f-7a51-4a92-87aa-40010b66cd86
Content-Type: application/json

--- request body ---
{"handle":"qa-2f34edc22511","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e933a05f-7a51-4a92-87aa-40010b66cd86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f070ae46-4209-4863-b90d-116daa3f9b15"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-68f0d705-c899-4b25-a36c-38cb5f09bdd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68f0d705-c899-4b25-a36c-38cb5f09bdd5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6129d77e85e7","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-68f0d705-c899-4b25-a36c-38cb5f09bdd5
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
Location: /v1/conversations/cnv_2807174d-c416-45db-b1eb-4cd664cce6ee
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2807174d-c416-45db-b1eb-4cd664cce6ee","subject":"Error contract","status":"open","region":"eu","participants":["qa-2f34edc22511","qa-6129d77e85e7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:03.552076041Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-65e888a3-cae5-4b06-8e32-f89c5578b357

--- request headers ---
Accept: application/json
X-Fault-Key: 85ce3e0d-85bc-4e7e-8680-30f8a432887d
X-Fault: unavailable-once
X-Correlation-Id: qa-65e888a3-cae5-4b06-8e32-f89c5578b357
Content-Type: application/json

--- response: 503 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65e888a3-cae5-4b06-8e32-f89c5578b357
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-65e888a3-cae5-4b06-8e32-f89c5578b357"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a752350f-8bfd-4655-a4ab-cda6a615b0b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a752350f-8bfd-4655-a4ab-cda6a615b0b4
Content-Type: application/json

--- request body ---
{"handle":"qa-6129d77e85e7","password":"****"}

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a752350f-8bfd-4655-a4ab-cda6a615b0b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6fd4928d-7ff9-4238-b9ce-3f176a3e82f3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-317cf8b1-e22b-4e3d-8fa2-368eda3eff4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-317cf8b1-e22b-4e3d-8fa2-368eda3eff4c
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-317cf8b1-e22b-4e3d-8fa2-368eda3eff4c
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
correlation: qa-09722c99-1b22-40ed-ac66-8501f6eef950

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09722c99-1b22-40ed-ac66-8501f6eef950
Content-Type: application/json

--- request body ---
{"handle":"qa-6129d77e85e7","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09722c99-1b22-40ed-ac66-8501f6eef950
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-09722c99-1b22-40ed-ac66-8501f6eef950"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e6df5671-0adc-45e6-824b-0dcbd1d1ea17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6df5671-0adc-45e6-824b-0dcbd1d1ea17
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e6df5671-0adc-45e6-824b-0dcbd1d1ea17
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
correlation: qa-5091ea7c-1a94-4dc8-81aa-d7e7a0aa4642

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5091ea7c-1a94-4dc8-81aa-d7e7a0aa4642
Content-Type: application/json

--- request body ---
{"handle":"qa-2f34edc22511","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5091ea7c-1a94-4dc8-81aa-d7e7a0aa4642
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5091ea7c-1a94-4dc8-81aa-d7e7a0aa4642"}
```
