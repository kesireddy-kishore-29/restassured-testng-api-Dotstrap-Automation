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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-5dbf2efc-afe8-4649-bc95-a44403489301` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-70419997-4900-4571-b9cc-129a298d9f04` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-81d3c8b4-5977-4a05-866b-db4a0e200715` |
| 4 | `POST /v1/conversations` | 201 | 44 | `qa-c8069763-469b-4c53-ad0a-064c16d96c54` |
| 5 | `GET /v1/conversations/{id}` | 503 | 15 | `qa-a355db40-1ee9-44c8-b45d-c3e4c68df865` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-4e0f27a6-d2cb-43ed-a949-ad2062d6d698` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-80bd6e11-a3eb-4838-bb3a-39bc1f8aa516` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-a739b6fc-b77a-4ee0-a3df-56f0e1a3bddd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-93152c22-95d8-45b1-a63b-562c19ea7eb5` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-e305e798-5038-4d3f-ba8a-407050032d52` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5dbf2efc-afe8-4649-bc95-a44403489301

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dbf2efc-afe8-4649-bc95-a44403489301
Content-Type: application/json

--- request body ---
{"handle":"qa-afbb8b04320f","displayName":"QA afbb8b04320f","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5dbf2efc-afe8-4649-bc95-a44403489301
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 7
Location: /v1/accounts/qa-afbb8b04320f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_edcdd194-d609-4df8-8ec5-86659effa400","handle":"qa-afbb8b04320f","displayName":"QA afbb8b04320f","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.096517522Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-70419997-4900-4571-b9cc-129a298d9f04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70419997-4900-4571-b9cc-129a298d9f04
Content-Type: application/json

--- request body ---
{"handle":"qa-728548123f3d","displayName":"QA 728548123f3d","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-70419997-4900-4571-b9cc-129a298d9f04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 7
Location: /v1/accounts/qa-728548123f3d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_034f6797-8e22-4703-97ce-0c813e20866e","handle":"qa-728548123f3d","displayName":"QA 728548123f3d","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.154618643Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-81d3c8b4-5977-4a05-866b-db4a0e200715

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81d3c8b4-5977-4a05-866b-db4a0e200715
Content-Type: application/json

--- request body ---
{"handle":"qa-afbb8b04320f","password":"****"}

--- response: 200 in 46 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-81d3c8b4-5977-4a05-866b-db4a0e200715
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_edcdd194-d609-4df8-8ec5-86659effa400"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c8069763-469b-4c53-ad0a-064c16d96c54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8069763-469b-4c53-ad0a-064c16d96c54
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-728548123f3d","subject":"Error contract","message":"Hi"}

--- response: 201 in 44 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8069763-469b-4c53-ad0a-064c16d96c54
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
Location: /v1/conversations/cnv_1e65d674-656f-455c-ac55-982eacc8a11e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1e65d674-656f-455c-ac55-982eacc8a11e","subject":"Error contract","status":"open","region":"eu","participants":["qa-afbb8b04320f","qa-728548123f3d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:46.302163636Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_1e65d674-656f-455c-ac55-982eacc8a11e
correlation: qa-a355db40-1ee9-44c8-b45d-c3e4c68df865

--- request headers ---
Accept: application/json
X-Fault-Key: d0ab46b9-19af-42c3-813f-d7df8e68573b
X-Fault: unavailable-once
X-Correlation-Id: qa-a355db40-1ee9-44c8-b45d-c3e4c68df865
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a355db40-1ee9-44c8-b45d-c3e4c68df865
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_1e65d674-656f-455c-ac55-982eacc8a11e","correlationId":"qa-a355db40-1ee9-44c8-b45d-c3e4c68df865"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4e0f27a6-d2cb-43ed-a949-ad2062d6d698

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e0f27a6-d2cb-43ed-a949-ad2062d6d698
Content-Type: application/json

--- request body ---
{"handle":"qa-728548123f3d","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e0f27a6-d2cb-43ed-a949-ad2062d6d698
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_034f6797-8e22-4703-97ce-0c813e20866e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-80bd6e11-a3eb-4838-bb3a-39bc1f8aa516

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80bd6e11-a3eb-4838-bb3a-39bc1f8aa516
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-80bd6e11-a3eb-4838-bb3a-39bc1f8aa516
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
correlation: qa-a739b6fc-b77a-4ee0-a3df-56f0e1a3bddd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a739b6fc-b77a-4ee0-a3df-56f0e1a3bddd
Content-Type: application/json

--- request body ---
{"handle":"qa-728548123f3d","password":"****"}

--- response: 401 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a739b6fc-b77a-4ee0-a3df-56f0e1a3bddd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a739b6fc-b77a-4ee0-a3df-56f0e1a3bddd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-93152c22-95d8-45b1-a63b-562c19ea7eb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93152c22-95d8-45b1-a63b-562c19ea7eb5
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-93152c22-95d8-45b1-a63b-562c19ea7eb5
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
correlation: qa-e305e798-5038-4d3f-ba8a-407050032d52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e305e798-5038-4d3f-ba8a-407050032d52
Content-Type: application/json

--- request body ---
{"handle":"qa-afbb8b04320f","password":"****"}

--- response: 401 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e305e798-5038-4d3f-ba8a-407050032d52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e305e798-5038-4d3f-ba8a-407050032d52"}
```
