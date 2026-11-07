# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-c04d8716-9543-4f23-b7e8-5ca982140d82` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-17e7b888-9f54-46b4-9582-807d0738b9b0` |
| 3 | `POST /v1/auth/token` | 200 | 69 | `qa-89340a99-9925-4251-a05d-3f912ff7555c` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-28087bd2-b5e0-459b-ab0a-30c99eb672ee` |
| 5 | `POST /v1/auth/token` | 503 | 29 | `qa-37077388-47b0-4142-a5a1-b39be0d45a98` |
| 6 | `POST /v1/auth/token` | 200 | 59 | `qa-eb8db19c-2a73-4787-872b-7a8c9bf7dae6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-cf5658db-69e8-4afb-8bab-66712cd2f297` |
| 8 | `POST /v1/auth/token` | 401 | 108 | `qa-bd1f2e59-94c9-40e7-8a82-82faae7838b6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-f0586b3c-e277-4fc3-a065-b515175db89c` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-e6ab6235-d3be-49db-8298-00e6da814961` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c04d8716-9543-4f23-b7e8-5ca982140d82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c04d8716-9543-4f23-b7e8-5ca982140d82
Content-Type: application/json

--- request body ---
{"handle":"qa-64d5bab5ded4","displayName":"QA 64d5bab5ded4","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c04d8716-9543-4f23-b7e8-5ca982140d82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Location: /v1/accounts/qa-64d5bab5ded4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ac6c3066-5ba1-4131-a3af-084a35818a3b","handle":"qa-64d5bab5ded4","displayName":"QA 64d5bab5ded4","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.207626693Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-17e7b888-9f54-46b4-9582-807d0738b9b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17e7b888-9f54-46b4-9582-807d0738b9b0
Content-Type: application/json

--- request body ---
{"handle":"qa-dff630e71b68","displayName":"QA dff630e71b68","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-17e7b888-9f54-46b4-9582-807d0738b9b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Location: /v1/accounts/qa-dff630e71b68
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0617cc76-7d22-43a7-893f-abf1ba88658c","handle":"qa-dff630e71b68","displayName":"QA dff630e71b68","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.269651363Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-89340a99-9925-4251-a05d-3f912ff7555c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89340a99-9925-4251-a05d-3f912ff7555c
Content-Type: application/json

--- request body ---
{"handle":"qa-64d5bab5ded4","password":"****"}

--- response: 200 in 69 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-89340a99-9925-4251-a05d-3f912ff7555c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ac6c3066-5ba1-4131-a3af-084a35818a3b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-28087bd2-b5e0-459b-ab0a-30c99eb672ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28087bd2-b5e0-459b-ab0a-30c99eb672ee
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dff630e71b68","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-28087bd2-b5e0-459b-ab0a-30c99eb672ee
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
Location: /v1/conversations/cnv_967e076d-f315-469e-adcf-7c2a3ee9a9f5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_967e076d-f315-469e-adcf-7c2a3ee9a9f5","subject":"Error contract","status":"open","region":"eu","participants":["qa-64d5bab5ded4","qa-dff630e71b68"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:31.395031089Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-37077388-47b0-4142-a5a1-b39be0d45a98

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 4dc2c840-9012-4fe6-bc8d-b91a025bde69
X-Correlation-Id: qa-37077388-47b0-4142-a5a1-b39be0d45a98
Content-Type: application/json

--- request body ---
{"handle":"qa-64d5bab5ded4","password":"****"}

--- response: 503 in 29 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37077388-47b0-4142-a5a1-b39be0d45a98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-37077388-47b0-4142-a5a1-b39be0d45a98"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-eb8db19c-2a73-4787-872b-7a8c9bf7dae6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb8db19c-2a73-4787-872b-7a8c9bf7dae6
Content-Type: application/json

--- request body ---
{"handle":"qa-dff630e71b68","password":"****"}

--- response: 200 in 59 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb8db19c-2a73-4787-872b-7a8c9bf7dae6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0617cc76-7d22-43a7-893f-abf1ba88658c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cf5658db-69e8-4afb-8bab-66712cd2f297

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf5658db-69e8-4afb-8bab-66712cd2f297
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cf5658db-69e8-4afb-8bab-66712cd2f297
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
correlation: qa-bd1f2e59-94c9-40e7-8a82-82faae7838b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd1f2e59-94c9-40e7-8a82-82faae7838b6
Content-Type: application/json

--- request body ---
{"handle":"qa-dff630e71b68","password":"****"}

--- response: 401 in 108 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd1f2e59-94c9-40e7-8a82-82faae7838b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bd1f2e59-94c9-40e7-8a82-82faae7838b6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f0586b3c-e277-4fc3-a065-b515175db89c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0586b3c-e277-4fc3-a065-b515175db89c
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f0586b3c-e277-4fc3-a065-b515175db89c
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
correlation: qa-e6ab6235-d3be-49db-8298-00e6da814961

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6ab6235-d3be-49db-8298-00e6da814961
Content-Type: application/json

--- request body ---
{"handle":"qa-64d5bab5ded4","password":"****"}

--- response: 401 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e6ab6235-d3be-49db-8298-00e6da814961
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e6ab6235-d3be-49db-8298-00e6da814961"}
```
