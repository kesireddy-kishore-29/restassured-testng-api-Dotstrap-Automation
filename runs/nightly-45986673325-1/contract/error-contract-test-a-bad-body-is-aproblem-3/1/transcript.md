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
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-994b55af-0d70-450b-a529-dc530e4d5391` |
| 2 | `POST /v1/accounts` | 201 | 55 | `qa-483d704b-343a-47b8-8458-a4d9866099ea` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-dff255f2-e6bd-4ddc-ab94-127ae6c4fcf0` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-5750627d-be52-4b32-8fa5-7057b89ef18b` |
| 5 | `POST /v1/accounts` | 400 | 32 | `qa-364e9e56-e86f-428e-82a7-19c321d8d042` |
| 6 | `POST /v1/auth/token` | 200 | 76 | `qa-bc903791-00f9-466e-a3bf-bf17b3beefc5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-0e00fa04-56fd-43b2-b5a5-8ddd91ced9b5` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-2ca3f6ed-6490-4604-87f3-fb82b35f2287` |
| 9 | `DELETE /v1/accounts/me` | 204 | 82 | `qa-e6e388dc-5d6a-49ee-8f8b-8b61ca736073` |
| 10 | `POST /v1/auth/token` | 401 | 60 | `qa-5b6bbf22-eceb-4527-8275-6771661e5e52` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-994b55af-0d70-450b-a529-dc530e4d5391

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-994b55af-0d70-450b-a529-dc530e4d5391
Content-Type: application/json

--- request body ---
{"handle":"qa-7d0ac47e607f","displayName":"QA 7d0ac47e607f","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-994b55af-0d70-450b-a529-dc530e4d5391
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
Location: /v1/accounts/qa-7d0ac47e607f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_66353e11-1606-409c-a33b-91d6f27777f7","handle":"qa-7d0ac47e607f","displayName":"QA 7d0ac47e607f","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.016216020Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-483d704b-343a-47b8-8458-a4d9866099ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-483d704b-343a-47b8-8458-a4d9866099ea
Content-Type: application/json

--- request body ---
{"handle":"qa-745df521314f","displayName":"QA 745df521314f","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-483d704b-343a-47b8-8458-a4d9866099ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Location: /v1/accounts/qa-745df521314f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_84f2e3c8-2908-4e9d-981a-864bc0ee54e6","handle":"qa-745df521314f","displayName":"QA 745df521314f","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.085271072Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dff255f2-e6bd-4ddc-ab94-127ae6c4fcf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dff255f2-e6bd-4ddc-ab94-127ae6c4fcf0
Content-Type: application/json

--- request body ---
{"handle":"qa-7d0ac47e607f","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-dff255f2-e6bd-4ddc-ab94-127ae6c4fcf0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_66353e11-1606-409c-a33b-91d6f27777f7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5750627d-be52-4b32-8fa5-7057b89ef18b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5750627d-be52-4b32-8fa5-7057b89ef18b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-745df521314f","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5750627d-be52-4b32-8fa5-7057b89ef18b
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
Location: /v1/conversations/cnv_4932efcc-fc27-4f3d-a8f0-237cded312d7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4932efcc-fc27-4f3d-a8f0-237cded312d7","subject":"Error contract","status":"open","region":"eu","participants":["qa-7d0ac47e607f","qa-745df521314f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:57.171024972Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-364e9e56-e86f-428e-82a7-19c321d8d042

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-364e9e56-e86f-428e-82a7-19c321d8d042
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 32 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-364e9e56-e86f-428e-82a7-19c321d8d042
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-364e9e56-e86f-428e-82a7-19c321d8d042"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bc903791-00f9-466e-a3bf-bf17b3beefc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc903791-00f9-466e-a3bf-bf17b3beefc5
Content-Type: application/json

--- request body ---
{"handle":"qa-745df521314f","password":"****"}

--- response: 200 in 76 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc903791-00f9-466e-a3bf-bf17b3beefc5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_84f2e3c8-2908-4e9d-981a-864bc0ee54e6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0e00fa04-56fd-43b2-b5a5-8ddd91ced9b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e00fa04-56fd-43b2-b5a5-8ddd91ced9b5
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0e00fa04-56fd-43b2-b5a5-8ddd91ced9b5
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
correlation: qa-2ca3f6ed-6490-4604-87f3-fb82b35f2287

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ca3f6ed-6490-4604-87f3-fb82b35f2287
Content-Type: application/json

--- request body ---
{"handle":"qa-745df521314f","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ca3f6ed-6490-4604-87f3-fb82b35f2287
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2ca3f6ed-6490-4604-87f3-fb82b35f2287"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e6e388dc-5d6a-49ee-8f8b-8b61ca736073

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6e388dc-5d6a-49ee-8f8b-8b61ca736073
Content-Type: application/json

--- response: 204 in 82 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e6e388dc-5d6a-49ee-8f8b-8b61ca736073
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
correlation: qa-5b6bbf22-eceb-4527-8275-6771661e5e52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b6bbf22-eceb-4527-8275-6771661e5e52
Content-Type: application/json

--- request body ---
{"handle":"qa-7d0ac47e607f","password":"****"}

--- response: 401 in 60 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b6bbf22-eceb-4527-8275-6771661e5e52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b6bbf22-eceb-4527-8275-6771661e5e52"}
```
