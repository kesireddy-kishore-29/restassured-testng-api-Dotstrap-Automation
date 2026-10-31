# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 58 | `qa-b5821959-1d75-4710-8112-3961121eeb75` |
| 2 | `POST /v1/accounts` | 201 | 56 | `qa-8ac7d4bf-960d-4cc7-8a75-a9cfa41f3638` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-58b7450e-217a-49f6-808e-2c52915c422b` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-943f239a-a508-4765-aba2-3fb10ca2d6be` |
| 5 | `GET /v1/conversations` | 503 | 10 | `qa-78e07361-17d7-413d-ad7a-c5aeb33c1f2b` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-b399b492-52dc-47c4-87ed-b7858fe98caa` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-0d143198-324c-41a4-b3fc-0c8f6d5c22d0` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-48bb36f2-e4fa-4d67-8e48-af2cab411b97` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-50dd3832-73ca-4f65-a6bb-ecf98f03d5aa` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-75232e13-c4b7-48af-8b99-0c8e5de43c2a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b5821959-1d75-4710-8112-3961121eeb75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5821959-1d75-4710-8112-3961121eeb75
Content-Type: application/json

--- request body ---
{"handle":"qa-99f4ccf7d661","displayName":"QA 99f4ccf7d661","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5821959-1d75-4710-8112-3961121eeb75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Location: /v1/accounts/qa-99f4ccf7d661
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f91b7f6f-4c56-4924-9032-09187bf2b189","handle":"qa-99f4ccf7d661","displayName":"QA 99f4ccf7d661","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.062914438Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8ac7d4bf-960d-4cc7-8a75-a9cfa41f3638

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ac7d4bf-960d-4cc7-8a75-a9cfa41f3638
Content-Type: application/json

--- request body ---
{"handle":"qa-3e0bbd1a4ae2","displayName":"QA 3e0bbd1a4ae2","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ac7d4bf-960d-4cc7-8a75-a9cfa41f3638
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Location: /v1/accounts/qa-3e0bbd1a4ae2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_714f4eaf-2d3a-47d7-ac60-44f3b6bbd77b","handle":"qa-3e0bbd1a4ae2","displayName":"QA 3e0bbd1a4ae2","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.155668105Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-58b7450e-217a-49f6-808e-2c52915c422b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58b7450e-217a-49f6-808e-2c52915c422b
Content-Type: application/json

--- request body ---
{"handle":"qa-99f4ccf7d661","password":"****"}

--- response: 200 in 45 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-58b7450e-217a-49f6-808e-2c52915c422b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f91b7f6f-4c56-4924-9032-09187bf2b189"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-943f239a-a508-4765-aba2-3fb10ca2d6be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-943f239a-a508-4765-aba2-3fb10ca2d6be
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3e0bbd1a4ae2","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-943f239a-a508-4765-aba2-3fb10ca2d6be
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
Location: /v1/conversations/cnv_def59f81-8fa6-4b54-98ce-674d91548c6c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_def59f81-8fa6-4b54-98ce-674d91548c6c","subject":"Error contract","status":"open","region":"eu","participants":["qa-99f4ccf7d661","qa-3e0bbd1a4ae2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.296612734Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-78e07361-17d7-413d-ad7a-c5aeb33c1f2b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 7d53b677-d6ea-42da-82a0-d89f4475919c
X-Correlation-Id: qa-78e07361-17d7-413d-ad7a-c5aeb33c1f2b
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78e07361-17d7-413d-ad7a-c5aeb33c1f2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-78e07361-17d7-413d-ad7a-c5aeb33c1f2b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b399b492-52dc-47c4-87ed-b7858fe98caa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b399b492-52dc-47c4-87ed-b7858fe98caa
Content-Type: application/json

--- request body ---
{"handle":"qa-3e0bbd1a4ae2","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b399b492-52dc-47c4-87ed-b7858fe98caa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_714f4eaf-2d3a-47d7-ac60-44f3b6bbd77b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0d143198-324c-41a4-b3fc-0c8f6d5c22d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d143198-324c-41a4-b3fc-0c8f6d5c22d0
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0d143198-324c-41a4-b3fc-0c8f6d5c22d0
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
correlation: qa-48bb36f2-e4fa-4d67-8e48-af2cab411b97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48bb36f2-e4fa-4d67-8e48-af2cab411b97
Content-Type: application/json

--- request body ---
{"handle":"qa-3e0bbd1a4ae2","password":"****"}

--- response: 401 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48bb36f2-e4fa-4d67-8e48-af2cab411b97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-48bb36f2-e4fa-4d67-8e48-af2cab411b97"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-50dd3832-73ca-4f65-a6bb-ecf98f03d5aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50dd3832-73ca-4f65-a6bb-ecf98f03d5aa
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-50dd3832-73ca-4f65-a6bb-ecf98f03d5aa
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
correlation: qa-75232e13-c4b7-48af-8b99-0c8e5de43c2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75232e13-c4b7-48af-8b99-0c8e5de43c2a
Content-Type: application/json

--- request body ---
{"handle":"qa-99f4ccf7d661","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75232e13-c4b7-48af-8b99-0c8e5de43c2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-75232e13-c4b7-48af-8b99-0c8e5de43c2a"}
```
