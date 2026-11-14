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
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-cfb18115-277b-47a1-889b-4fb56fefe278` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-97c373af-4657-4b70-a5bd-d1f1771bd6dd` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-793fd55f-d961-4d9e-a72b-6a70cd18d770` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-6612bc2f-9cfc-411a-93a6-4e083721e844` |
| 5 | `POST /v1/accounts` | 400 | 22 | `qa-d45911e9-3bac-4af8-8e69-50c170689aec` |
| 6 | `POST /v1/auth/token` | 200 | 59 | `qa-eb43179a-6cb0-41dc-877e-2e230a9970f7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-758af21d-9a75-44f7-8b9b-f87e996040b2` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-b95abb1a-e5c0-4394-b82b-3ee4b8476aaa` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-d09062eb-225d-440f-84ab-fe71d5065590` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-6c55688f-e478-4b31-b8d6-20d91d7441fb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cfb18115-277b-47a1-889b-4fb56fefe278

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfb18115-277b-47a1-889b-4fb56fefe278
Content-Type: application/json

--- request body ---
{"handle":"qa-8f003f1f15ee","displayName":"QA 8f003f1f15ee","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfb18115-277b-47a1-889b-4fb56fefe278
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Location: /v1/accounts/qa-8f003f1f15ee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_52004c41-2172-4022-9d3c-27851ffb5413","handle":"qa-8f003f1f15ee","displayName":"QA 8f003f1f15ee","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.082641161Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-97c373af-4657-4b70-a5bd-d1f1771bd6dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97c373af-4657-4b70-a5bd-d1f1771bd6dd
Content-Type: application/json

--- request body ---
{"handle":"qa-7c25b608ab72","displayName":"QA 7c25b608ab72","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-97c373af-4657-4b70-a5bd-d1f1771bd6dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 10
Location: /v1/accounts/qa-7c25b608ab72
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c63f29f3-e33e-47b5-9ae4-4132a1c64ad1","handle":"qa-7c25b608ab72","displayName":"QA 7c25b608ab72","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.120841667Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-793fd55f-d961-4d9e-a72b-6a70cd18d770

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-793fd55f-d961-4d9e-a72b-6a70cd18d770
Content-Type: application/json

--- request body ---
{"handle":"qa-8f003f1f15ee","password":"****"}

--- response: 200 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-793fd55f-d961-4d9e-a72b-6a70cd18d770
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_52004c41-2172-4022-9d3c-27851ffb5413"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6612bc2f-9cfc-411a-93a6-4e083721e844

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6612bc2f-9cfc-411a-93a6-4e083721e844
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7c25b608ab72","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-6612bc2f-9cfc-411a-93a6-4e083721e844
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
Location: /v1/conversations/cnv_d66bf1e9-b3cc-4fb2-ae9a-70a242debca7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d66bf1e9-b3cc-4fb2-ae9a-70a242debca7","subject":"Error contract","status":"open","region":"eu","participants":["qa-8f003f1f15ee","qa-7c25b608ab72"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:30.179655437Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-d45911e9-3bac-4af8-8e69-50c170689aec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d45911e9-3bac-4af8-8e69-50c170689aec
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d45911e9-3bac-4af8-8e69-50c170689aec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 10
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-d45911e9-3bac-4af8-8e69-50c170689aec"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-eb43179a-6cb0-41dc-877e-2e230a9970f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb43179a-6cb0-41dc-877e-2e230a9970f7
Content-Type: application/json

--- request body ---
{"handle":"qa-7c25b608ab72","password":"****"}

--- response: 200 in 59 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb43179a-6cb0-41dc-877e-2e230a9970f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c63f29f3-e33e-47b5-9ae4-4132a1c64ad1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-758af21d-9a75-44f7-8b9b-f87e996040b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-758af21d-9a75-44f7-8b9b-f87e996040b2
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-758af21d-9a75-44f7-8b9b-f87e996040b2
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
correlation: qa-b95abb1a-e5c0-4394-b82b-3ee4b8476aaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b95abb1a-e5c0-4394-b82b-3ee4b8476aaa
Content-Type: application/json

--- request body ---
{"handle":"qa-7c25b608ab72","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b95abb1a-e5c0-4394-b82b-3ee4b8476aaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b95abb1a-e5c0-4394-b82b-3ee4b8476aaa"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d09062eb-225d-440f-84ab-fe71d5065590

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d09062eb-225d-440f-84ab-fe71d5065590
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d09062eb-225d-440f-84ab-fe71d5065590
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
correlation: qa-6c55688f-e478-4b31-b8d6-20d91d7441fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c55688f-e478-4b31-b8d6-20d91d7441fb
Content-Type: application/json

--- request body ---
{"handle":"qa-8f003f1f15ee","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c55688f-e478-4b31-b8d6-20d91d7441fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6c55688f-e478-4b31-b8d6-20d91d7441fb"}
```
