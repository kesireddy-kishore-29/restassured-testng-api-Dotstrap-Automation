# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-2da8ffb0-f07b-45c4-921d-79842ad1c3c3` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-a5f06421-0c03-4657-a6f4-25a30a4a5f64` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-2b028167-2513-46da-9ee2-41e7b7b57891` |
| 4 | `POST /v1/conversations` | 201 | 39 | `qa-6460d493-7252-47df-8f90-f155e8259fde` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 15 | `qa-1160265e-0173-4478-9f40-34b6ec0d2873` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-d5fb2151-60c4-4526-916b-ead712fd851d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-ef6fbca9-cc53-4a8b-9993-039b180b9efb` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-809257fa-0d72-4f2a-8992-e9866cebdb33` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-f2c552da-d6d3-4bcf-ad31-d0e306405b9e` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-6787a940-91d9-45b6-91a4-67bc6222c33e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2da8ffb0-f07b-45c4-921d-79842ad1c3c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2da8ffb0-f07b-45c4-921d-79842ad1c3c3
Content-Type: application/json

--- request body ---
{"handle":"qa-a8dfd248957f","displayName":"QA a8dfd248957f","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-2da8ffb0-f07b-45c4-921d-79842ad1c3c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Location: /v1/accounts/qa-a8dfd248957f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0a19a254-8cc2-4001-b9f5-7188df868351","handle":"qa-a8dfd248957f","displayName":"QA a8dfd248957f","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.088551083Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a5f06421-0c03-4657-a6f4-25a30a4a5f64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5f06421-0c03-4657-a6f4-25a30a4a5f64
Content-Type: application/json

--- request body ---
{"handle":"qa-eb55107f9a22","displayName":"QA eb55107f9a22","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5f06421-0c03-4657-a6f4-25a30a4a5f64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 8
Location: /v1/accounts/qa-eb55107f9a22
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0de05fe0-ccea-45c1-8938-15ad0d692ad5","handle":"qa-eb55107f9a22","displayName":"QA eb55107f9a22","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.135153916Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2b028167-2513-46da-9ee2-41e7b7b57891

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b028167-2513-46da-9ee2-41e7b7b57891
Content-Type: application/json

--- request body ---
{"handle":"qa-a8dfd248957f","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b028167-2513-46da-9ee2-41e7b7b57891
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0a19a254-8cc2-4001-b9f5-7188df868351"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6460d493-7252-47df-8f90-f155e8259fde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6460d493-7252-47df-8f90-f155e8259fde
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-eb55107f9a22","subject":"Error contract","message":"Hi"}

--- response: 201 in 39 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-6460d493-7252-47df-8f90-f155e8259fde
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
Location: /v1/conversations/cnv_a837b8f8-da08-437a-9621-31d25d1b861f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a837b8f8-da08-437a-9621-31d25d1b861f","subject":"Error contract","status":"open","region":"eu","participants":["qa-a8dfd248957f","qa-eb55107f9a22"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.218413755Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_a837b8f8-da08-437a-9621-31d25d1b861f/read
correlation: qa-1160265e-0173-4478-9f40-34b6ec0d2873

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 22eeff51-d26f-4da3-a62c-f358c346a41e
X-Correlation-Id: qa-1160265e-0173-4478-9f40-34b6ec0d2873
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1160265e-0173-4478-9f40-34b6ec0d2873
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_a837b8f8-da08-437a-9621-31d25d1b861f/read","correlationId":"qa-1160265e-0173-4478-9f40-34b6ec0d2873"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d5fb2151-60c4-4526-916b-ead712fd851d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5fb2151-60c4-4526-916b-ead712fd851d
Content-Type: application/json

--- request body ---
{"handle":"qa-eb55107f9a22","password":"****"}

--- response: 200 in 30 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5fb2151-60c4-4526-916b-ead712fd851d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0de05fe0-ccea-45c1-8938-15ad0d692ad5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ef6fbca9-cc53-4a8b-9993-039b180b9efb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef6fbca9-cc53-4a8b-9993-039b180b9efb
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ef6fbca9-cc53-4a8b-9993-039b180b9efb
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
correlation: qa-809257fa-0d72-4f2a-8992-e9866cebdb33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-809257fa-0d72-4f2a-8992-e9866cebdb33
Content-Type: application/json

--- request body ---
{"handle":"qa-eb55107f9a22","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-809257fa-0d72-4f2a-8992-e9866cebdb33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-809257fa-0d72-4f2a-8992-e9866cebdb33"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f2c552da-d6d3-4bcf-ad31-d0e306405b9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2c552da-d6d3-4bcf-ad31-d0e306405b9e
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f2c552da-d6d3-4bcf-ad31-d0e306405b9e
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
correlation: qa-6787a940-91d9-45b6-91a4-67bc6222c33e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6787a940-91d9-45b6-91a4-67bc6222c33e
Content-Type: application/json

--- request body ---
{"handle":"qa-a8dfd248957f","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6787a940-91d9-45b6-91a4-67bc6222c33e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6787a940-91d9-45b6-91a4-67bc6222c33e"}
```
