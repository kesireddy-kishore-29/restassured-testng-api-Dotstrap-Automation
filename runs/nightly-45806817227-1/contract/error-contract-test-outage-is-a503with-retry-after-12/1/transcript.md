# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-84c22690-cb34-412f-be7d-1f3706a99605` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-9623e550-e36c-4d44-a7ac-40029511558b` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-003d0686-8b9d-40e6-9571-05d320572aca` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-4a4b84e0-9933-4d7d-940a-f2b8312e50f3` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 15 | `qa-af53b9cb-0066-483a-a497-4ff8ec0ca611` |
| 6 | `POST /v1/auth/token` | 200 | 76 | `qa-48a6fc22-cc07-491e-b94d-7df175dd69d3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-35cec95a-0172-40eb-994c-8ff7b661bc5f` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-35e48800-c9a9-43fd-9cfe-4f8b78bdea37` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-505f8136-6cb7-4557-9f0b-db3c62fc1b53` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-75ca7c38-9f81-4a1a-8f68-95056a927d95` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-84c22690-cb34-412f-be7d-1f3706a99605

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84c22690-cb34-412f-be7d-1f3706a99605
Content-Type: application/json

--- request body ---
{"handle":"qa-bb269e07c99b","displayName":"QA bb269e07c99b","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-84c22690-cb34-412f-be7d-1f3706a99605
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 6
Location: /v1/accounts/qa-bb269e07c99b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ad80580b-4fcc-45ef-b28a-c462129648c7","handle":"qa-bb269e07c99b","displayName":"QA bb269e07c99b","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.379501220Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9623e550-e36c-4d44-a7ac-40029511558b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9623e550-e36c-4d44-a7ac-40029511558b
Content-Type: application/json

--- request body ---
{"handle":"qa-af8572e40aee","displayName":"QA af8572e40aee","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-9623e550-e36c-4d44-a7ac-40029511558b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 6
Location: /v1/accounts/qa-af8572e40aee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bafc0c5b-7690-4f8b-8e6d-54943ea744c5","handle":"qa-af8572e40aee","displayName":"QA af8572e40aee","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.417242370Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-003d0686-8b9d-40e6-9571-05d320572aca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-003d0686-8b9d-40e6-9571-05d320572aca
Content-Type: application/json

--- request body ---
{"handle":"qa-bb269e07c99b","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-003d0686-8b9d-40e6-9571-05d320572aca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ad80580b-4fcc-45ef-b28a-c462129648c7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4a4b84e0-9933-4d7d-940a-f2b8312e50f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a4b84e0-9933-4d7d-940a-f2b8312e50f3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-af8572e40aee","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a4b84e0-9933-4d7d-940a-f2b8312e50f3
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
Location: /v1/conversations/cnv_707496b7-b8b0-44ce-a3d9-e393028e605b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_707496b7-b8b0-44ce-a3d9-e393028e605b","subject":"Error contract","status":"open","region":"eu","participants":["qa-bb269e07c99b","qa-af8572e40aee"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:46.513290206Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_707496b7-b8b0-44ce-a3d9-e393028e605b/close
correlation: qa-af53b9cb-0066-483a-a497-4ff8ec0ca611

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c1cf96e8-db6b-40b3-901f-9b0462f9cc2b
X-Correlation-Id: qa-af53b9cb-0066-483a-a497-4ff8ec0ca611
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af53b9cb-0066-483a-a497-4ff8ec0ca611
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_707496b7-b8b0-44ce-a3d9-e393028e605b/close","correlationId":"qa-af53b9cb-0066-483a-a497-4ff8ec0ca611"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-48a6fc22-cc07-491e-b94d-7df175dd69d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48a6fc22-cc07-491e-b94d-7df175dd69d3
Content-Type: application/json

--- request body ---
{"handle":"qa-af8572e40aee","password":"****"}

--- response: 200 in 76 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-48a6fc22-cc07-491e-b94d-7df175dd69d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bafc0c5b-7690-4f8b-8e6d-54943ea744c5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35cec95a-0172-40eb-994c-8ff7b661bc5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35cec95a-0172-40eb-994c-8ff7b661bc5f
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35cec95a-0172-40eb-994c-8ff7b661bc5f
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
correlation: qa-35e48800-c9a9-43fd-9cfe-4f8b78bdea37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35e48800-c9a9-43fd-9cfe-4f8b78bdea37
Content-Type: application/json

--- request body ---
{"handle":"qa-af8572e40aee","password":"****"}

--- response: 401 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35e48800-c9a9-43fd-9cfe-4f8b78bdea37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-35e48800-c9a9-43fd-9cfe-4f8b78bdea37"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-505f8136-6cb7-4557-9f0b-db3c62fc1b53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-505f8136-6cb7-4557-9f0b-db3c62fc1b53
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-505f8136-6cb7-4557-9f0b-db3c62fc1b53
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
correlation: qa-75ca7c38-9f81-4a1a-8f68-95056a927d95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75ca7c38-9f81-4a1a-8f68-95056a927d95
Content-Type: application/json

--- request body ---
{"handle":"qa-bb269e07c99b","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75ca7c38-9f81-4a1a-8f68-95056a927d95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-75ca7c38-9f81-4a1a-8f68-95056a927d95"}
```
