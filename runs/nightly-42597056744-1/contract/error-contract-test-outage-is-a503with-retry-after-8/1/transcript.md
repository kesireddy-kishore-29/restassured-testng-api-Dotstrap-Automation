# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-071731f9-7e9e-4b7f-ba41-06a0313c706f` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-76459e25-d533-4206-81a6-81dd399a925f` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-730c07d3-d32f-4a71-b1e9-c5e9bd3a1910` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-1636ae75-63d9-4e81-8fd2-84c5e433914f` |
| 5 | `GET /v1/conversations/{id}` | 503 | 11 | `qa-6d1158c8-8928-4e73-883d-6ed8f47b948b` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-a5064edb-a5a8-4286-8d01-a0ca69eaf0c8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-0945979c-c235-4cc7-a704-9141856df360` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-feff1b05-d284-4987-b2dc-a44fd11b918f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-f2e3d681-570e-4625-8dcf-904688720774` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-4a250cc6-7bcf-4c0c-916d-4883932fb12c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-071731f9-7e9e-4b7f-ba41-06a0313c706f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-071731f9-7e9e-4b7f-ba41-06a0313c706f
Content-Type: application/json

--- request body ---
{"handle":"qa-1b0b58ecb853","displayName":"QA 1b0b58ecb853","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-071731f9-7e9e-4b7f-ba41-06a0313c706f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Location: /v1/accounts/qa-1b0b58ecb853
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a32f9c31-661e-43de-9ea6-007783abdb03","handle":"qa-1b0b58ecb853","displayName":"QA 1b0b58ecb853","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.301540759Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-76459e25-d533-4206-81a6-81dd399a925f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76459e25-d533-4206-81a6-81dd399a925f
Content-Type: application/json

--- request body ---
{"handle":"qa-da658e7b0ddc","displayName":"QA da658e7b0ddc","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-76459e25-d533-4206-81a6-81dd399a925f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Location: /v1/accounts/qa-da658e7b0ddc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_65214187-290b-482a-9ba2-99239a69fc45","handle":"qa-da658e7b0ddc","displayName":"QA da658e7b0ddc","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.319146935Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-730c07d3-d32f-4a71-b1e9-c5e9bd3a1910

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-730c07d3-d32f-4a71-b1e9-c5e9bd3a1910
Content-Type: application/json

--- request body ---
{"handle":"qa-1b0b58ecb853","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-730c07d3-d32f-4a71-b1e9-c5e9bd3a1910
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a32f9c31-661e-43de-9ea6-007783abdb03"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1636ae75-63d9-4e81-8fd2-84c5e433914f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1636ae75-63d9-4e81-8fd2-84c5e433914f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-da658e7b0ddc","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1636ae75-63d9-4e81-8fd2-84c5e433914f
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
Location: /v1/conversations/cnv_c6f9886c-e525-4a8f-8c4f-b83aad0255ed
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c6f9886c-e525-4a8f-8c4f-b83aad0255ed","subject":"Error contract","status":"open","region":"eu","participants":["qa-1b0b58ecb853","qa-da658e7b0ddc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.370549221Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_c6f9886c-e525-4a8f-8c4f-b83aad0255ed
correlation: qa-6d1158c8-8928-4e73-883d-6ed8f47b948b

--- request headers ---
Accept: application/json
X-Fault-Key: 92c29f70-861e-45d6-a58a-d2403d0ab2a3
X-Fault: unavailable-once
X-Correlation-Id: qa-6d1158c8-8928-4e73-883d-6ed8f47b948b
Content-Type: application/json

--- response: 503 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d1158c8-8928-4e73-883d-6ed8f47b948b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_c6f9886c-e525-4a8f-8c4f-b83aad0255ed","correlationId":"qa-6d1158c8-8928-4e73-883d-6ed8f47b948b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a5064edb-a5a8-4286-8d01-a0ca69eaf0c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5064edb-a5a8-4286-8d01-a0ca69eaf0c8
Content-Type: application/json

--- request body ---
{"handle":"qa-da658e7b0ddc","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5064edb-a5a8-4286-8d01-a0ca69eaf0c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65214187-290b-482a-9ba2-99239a69fc45"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0945979c-c235-4cc7-a704-9141856df360

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0945979c-c235-4cc7-a704-9141856df360
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0945979c-c235-4cc7-a704-9141856df360
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
correlation: qa-feff1b05-d284-4987-b2dc-a44fd11b918f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-feff1b05-d284-4987-b2dc-a44fd11b918f
Content-Type: application/json

--- request body ---
{"handle":"qa-da658e7b0ddc","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-feff1b05-d284-4987-b2dc-a44fd11b918f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-feff1b05-d284-4987-b2dc-a44fd11b918f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f2e3d681-570e-4625-8dcf-904688720774

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2e3d681-570e-4625-8dcf-904688720774
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f2e3d681-570e-4625-8dcf-904688720774
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
correlation: qa-4a250cc6-7bcf-4c0c-916d-4883932fb12c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a250cc6-7bcf-4c0c-916d-4883932fb12c
Content-Type: application/json

--- request body ---
{"handle":"qa-1b0b58ecb853","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a250cc6-7bcf-4c0c-916d-4883932fb12c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4a250cc6-7bcf-4c0c-916d-4883932fb12c"}
```
