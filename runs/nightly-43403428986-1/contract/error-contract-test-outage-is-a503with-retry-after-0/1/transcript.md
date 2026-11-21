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
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-9eaf6471-8592-42f9-9acd-ffa6df7e589f` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-1536076f-0ecb-48d7-aea7-1dfa5b267fa7` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-f46398d9-42d4-46a5-ac76-14b264ee9942` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-45a01a7e-e1d7-462b-80ad-cb414dc53862` |
| 5 | `POST /v1/auth/token` | 503 | 23 | `qa-b99e64c8-cc6e-46e0-933d-e160f2c5c3ff` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-4db5fa25-cea7-428f-86bf-665d86ef3ff9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-10025c24-442d-4719-8856-b01130159f7a` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-de277a4d-6a9c-4522-bfbf-7914563efedc` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-d51c28ed-fd75-45ba-af70-2cfb34b79f97` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-d53a874e-68a8-4b92-9c4a-0393febc3229` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9eaf6471-8592-42f9-9acd-ffa6df7e589f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9eaf6471-8592-42f9-9acd-ffa6df7e589f
Content-Type: application/json

--- request body ---
{"handle":"qa-dcab258c5ec2","displayName":"QA dcab258c5ec2","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9eaf6471-8592-42f9-9acd-ffa6df7e589f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Location: /v1/accounts/qa-dcab258c5ec2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7bfd3f5c-abb3-4ec9-928c-1c7126c9a0a2","handle":"qa-dcab258c5ec2","displayName":"QA dcab258c5ec2","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.594293727Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1536076f-0ecb-48d7-aea7-1dfa5b267fa7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1536076f-0ecb-48d7-aea7-1dfa5b267fa7
Content-Type: application/json

--- request body ---
{"handle":"qa-29375cf44d5e","displayName":"QA 29375cf44d5e","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-1536076f-0ecb-48d7-aea7-1dfa5b267fa7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Location: /v1/accounts/qa-29375cf44d5e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bdaa8e32-3cab-4914-a8df-da59ede98aa2","handle":"qa-29375cf44d5e","displayName":"QA 29375cf44d5e","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.648363905Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f46398d9-42d4-46a5-ac76-14b264ee9942

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f46398d9-42d4-46a5-ac76-14b264ee9942
Content-Type: application/json

--- request body ---
{"handle":"qa-dcab258c5ec2","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f46398d9-42d4-46a5-ac76-14b264ee9942
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7bfd3f5c-abb3-4ec9-928c-1c7126c9a0a2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-45a01a7e-e1d7-462b-80ad-cb414dc53862

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45a01a7e-e1d7-462b-80ad-cb414dc53862
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-29375cf44d5e","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-45a01a7e-e1d7-462b-80ad-cb414dc53862
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
Location: /v1/conversations/cnv_48ff6164-4b43-411b-9816-f74710288e98
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_48ff6164-4b43-411b-9816-f74710288e98","subject":"Error contract","status":"open","region":"eu","participants":["qa-dcab258c5ec2","qa-29375cf44d5e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:05.728753434Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-b99e64c8-cc6e-46e0-933d-e160f2c5c3ff

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 600764b5-5dcb-421b-bbee-ab91d10430be
X-Correlation-Id: qa-b99e64c8-cc6e-46e0-933d-e160f2c5c3ff
Content-Type: application/json

--- request body ---
{"handle":"qa-dcab258c5ec2","password":"****"}

--- response: 503 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b99e64c8-cc6e-46e0-933d-e160f2c5c3ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-b99e64c8-cc6e-46e0-933d-e160f2c5c3ff"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4db5fa25-cea7-428f-86bf-665d86ef3ff9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4db5fa25-cea7-428f-86bf-665d86ef3ff9
Content-Type: application/json

--- request body ---
{"handle":"qa-29375cf44d5e","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4db5fa25-cea7-428f-86bf-665d86ef3ff9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bdaa8e32-3cab-4914-a8df-da59ede98aa2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-10025c24-442d-4719-8856-b01130159f7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10025c24-442d-4719-8856-b01130159f7a
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-10025c24-442d-4719-8856-b01130159f7a
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
correlation: qa-de277a4d-6a9c-4522-bfbf-7914563efedc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de277a4d-6a9c-4522-bfbf-7914563efedc
Content-Type: application/json

--- request body ---
{"handle":"qa-29375cf44d5e","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de277a4d-6a9c-4522-bfbf-7914563efedc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-de277a4d-6a9c-4522-bfbf-7914563efedc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d51c28ed-fd75-45ba-af70-2cfb34b79f97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d51c28ed-fd75-45ba-af70-2cfb34b79f97
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d51c28ed-fd75-45ba-af70-2cfb34b79f97
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
correlation: qa-d53a874e-68a8-4b92-9c4a-0393febc3229

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d53a874e-68a8-4b92-9c4a-0393febc3229
Content-Type: application/json

--- request body ---
{"handle":"qa-dcab258c5ec2","password":"****"}

--- response: 401 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d53a874e-68a8-4b92-9c4a-0393febc3229
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d53a874e-68a8-4b92-9c4a-0393febc3229"}
```
