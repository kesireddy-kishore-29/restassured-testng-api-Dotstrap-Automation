# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-6b54b38f-e013-4e2d-ab76-ef7d2956f610` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-ae4b4720-189c-40fa-87a9-79953a797198` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-f26090dd-e8e5-4935-bfdf-9691068aa96b` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-87322aa3-7f1f-48b4-8dbf-dae8d6699a6e` |
| 5 | `POST /v1/auth/token` | 400 | 25 | `qa-afa56a7a-835e-4c71-b8c3-379b29e9dcbb` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-ef75d36c-9fab-4e17-925b-535fabe028f6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-2eba4850-2938-43b6-9d2f-5b074c2757b5` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-e583703d-4cb0-49ad-878a-c2a40f7124ce` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-b5fa6824-a4d5-4d23-ac0a-4d882081fd7c` |
| 10 | `POST /v1/auth/token` | 401 | 40 | `qa-1e9478ed-263e-4548-b45c-b2fbeac05c8b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6b54b38f-e013-4e2d-ab76-ef7d2956f610

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b54b38f-e013-4e2d-ab76-ef7d2956f610
Content-Type: application/json

--- request body ---
{"handle":"qa-08e2dd0b2102","displayName":"QA 08e2dd0b2102","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b54b38f-e013-4e2d-ab76-ef7d2956f610
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-08e2dd0b2102
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2a934fc9-7df3-42d5-86fc-ed882eb12f1d","handle":"qa-08e2dd0b2102","displayName":"QA 08e2dd0b2102","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.671704067Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ae4b4720-189c-40fa-87a9-79953a797198

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae4b4720-189c-40fa-87a9-79953a797198
Content-Type: application/json

--- request body ---
{"handle":"qa-f8aac79045cc","displayName":"QA f8aac79045cc","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae4b4720-189c-40fa-87a9-79953a797198
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Location: /v1/accounts/qa-f8aac79045cc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d55fb609-ef5d-4e22-a6e3-af6378c1c682","handle":"qa-f8aac79045cc","displayName":"QA f8aac79045cc","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.706091693Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f26090dd-e8e5-4935-bfdf-9691068aa96b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f26090dd-e8e5-4935-bfdf-9691068aa96b
Content-Type: application/json

--- request body ---
{"handle":"qa-08e2dd0b2102","password":"****"}

--- response: 200 in 39 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f26090dd-e8e5-4935-bfdf-9691068aa96b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2a934fc9-7df3-42d5-86fc-ed882eb12f1d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-87322aa3-7f1f-48b4-8dbf-dae8d6699a6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87322aa3-7f1f-48b4-8dbf-dae8d6699a6e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f8aac79045cc","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-87322aa3-7f1f-48b4-8dbf-dae8d6699a6e
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
Location: /v1/conversations/cnv_ebe55afb-9f7f-4492-991b-aefd6a3c9d1e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ebe55afb-9f7f-4492-991b-aefd6a3c9d1e","subject":"Error contract","status":"open","region":"eu","participants":["qa-08e2dd0b2102","qa-f8aac79045cc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.802969921Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-afa56a7a-835e-4c71-b8c3-379b29e9dcbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afa56a7a-835e-4c71-b8c3-379b29e9dcbb
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-afa56a7a-835e-4c71-b8c3-379b29e9dcbb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 10
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-afa56a7a-835e-4c71-b8c3-379b29e9dcbb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ef75d36c-9fab-4e17-925b-535fabe028f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef75d36c-9fab-4e17-925b-535fabe028f6
Content-Type: application/json

--- request body ---
{"handle":"qa-f8aac79045cc","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef75d36c-9fab-4e17-925b-535fabe028f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d55fb609-ef5d-4e22-a6e3-af6378c1c682"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2eba4850-2938-43b6-9d2f-5b074c2757b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2eba4850-2938-43b6-9d2f-5b074c2757b5
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2eba4850-2938-43b6-9d2f-5b074c2757b5
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
correlation: qa-e583703d-4cb0-49ad-878a-c2a40f7124ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e583703d-4cb0-49ad-878a-c2a40f7124ce
Content-Type: application/json

--- request body ---
{"handle":"qa-f8aac79045cc","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e583703d-4cb0-49ad-878a-c2a40f7124ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e583703d-4cb0-49ad-878a-c2a40f7124ce"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b5fa6824-a4d5-4d23-ac0a-4d882081fd7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5fa6824-a4d5-4d23-ac0a-4d882081fd7c
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b5fa6824-a4d5-4d23-ac0a-4d882081fd7c
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
correlation: qa-1e9478ed-263e-4548-b45c-b2fbeac05c8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e9478ed-263e-4548-b45c-b2fbeac05c8b
Content-Type: application/json

--- request body ---
{"handle":"qa-08e2dd0b2102","password":"****"}

--- response: 401 in 40 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e9478ed-263e-4548-b45c-b2fbeac05c8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1e9478ed-263e-4548-b45c-b2fbeac05c8b"}
```
