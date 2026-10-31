# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 60 | `qa-972db6a9-c5bb-4bb1-86a8-f271d144d0b0` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-a29a4116-4d4e-424d-bf1a-387244b11117` |
| 3 | `POST /v1/accounts` | 201 | 41 | `qa-c0717964-71f1-47b0-bd69-76005f718173` |
| 4 | `POST /v1/auth/token` | 200 | 36 | `qa-8303472d-8a82-49b3-969a-42038b125d3d` |
| 5 | `POST /v1/conversations` | 201 | 11 | `qa-80dca5d8-3d33-4ef2-893e-16ecdd0450b4` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-7a487c36-b18c-46ad-a158-0ed0438176af` |
| 7 | `GET /v1/conversations/{id}` | 403 | 10 | `qa-22fedb9a-d0d5-4765-91d7-4b49d73eae11` |
| 8 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-b33484f7-d6f9-4087-a6fb-1e6a221de175` |
| 9 | `POST /v1/auth/token` | 401 | 25 | `qa-8e711631-f3f6-4388-a1a1-53c24382acca` |
| 10 | `POST /v1/auth/token` | 200 | 44 | `qa-fd372e09-9156-44fd-97a0-312a823a6565` |
| 11 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-3b12b324-e6ac-4694-a9ee-9ef0a8addf3f` |
| 12 | `POST /v1/auth/token` | 401 | 28 | `qa-67d0ca77-bcd0-44e2-8098-80e116fc9087` |
| 13 | `DELETE /v1/accounts/me` | 204 | 56 | `qa-0a9223c1-1354-4c2f-b769-474239073c41` |
| 14 | `POST /v1/auth/token` | 401 | 22 | `qa-f415d521-5060-46b2-9935-ce64584b0b22` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-972db6a9-c5bb-4bb1-86a8-f271d144d0b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-972db6a9-c5bb-4bb1-86a8-f271d144d0b0
Content-Type: application/json

--- request body ---
{"handle":"qa-2b72d8191a6e","displayName":"QA 2b72d8191a6e","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-972db6a9-c5bb-4bb1-86a8-f271d144d0b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Location: /v1/accounts/qa-2b72d8191a6e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_79a2f6ed-1783-4214-8a62-db04531489e4","handle":"qa-2b72d8191a6e","displayName":"QA 2b72d8191a6e","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.619268131Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a29a4116-4d4e-424d-bf1a-387244b11117

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a29a4116-4d4e-424d-bf1a-387244b11117
Content-Type: application/json

--- request body ---
{"handle":"qa-866b1547e7be","displayName":"QA 866b1547e7be","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-a29a4116-4d4e-424d-bf1a-387244b11117
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-866b1547e7be
X-Served-Region: eu
Content-Length: 181

{"id":"acc_62636119-1bc5-48f0-aa6a-aa7497e192e6","handle":"qa-866b1547e7be","displayName":"QA 866b1547e7be","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.700260771Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-c0717964-71f1-47b0-bd69-76005f718173

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0717964-71f1-47b0-bd69-76005f718173
Content-Type: application/json

--- request body ---
{"handle":"qa-05cc541b5154","displayName":"QA 05cc541b5154","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0717964-71f1-47b0-bd69-76005f718173
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Location: /v1/accounts/qa-05cc541b5154
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ea105401-3d16-4f70-be4a-05e46df83e03","handle":"qa-05cc541b5154","displayName":"QA 05cc541b5154","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.765107638Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8303472d-8a82-49b3-969a-42038b125d3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8303472d-8a82-49b3-969a-42038b125d3d
Content-Type: application/json

--- request body ---
{"handle":"qa-2b72d8191a6e","password":"****"}

--- response: 200 in 36 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-8303472d-8a82-49b3-969a-42038b125d3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_79a2f6ed-1783-4214-8a62-db04531489e4"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-80dca5d8-3d33-4ef2-893e-16ecdd0450b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80dca5d8-3d33-4ef2-893e-16ecdd0450b4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-866b1547e7be","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-80dca5d8-3d33-4ef2-893e-16ecdd0450b4
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
Location: /v1/conversations/cnv_a355b19b-fc0d-48f3-986b-dba847b5dba5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a355b19b-fc0d-48f3-986b-dba847b5dba5","subject":"Error contract","status":"open","region":"eu","participants":["qa-2b72d8191a6e","qa-866b1547e7be"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:32.864021357Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7a487c36-b18c-46ad-a158-0ed0438176af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a487c36-b18c-46ad-a158-0ed0438176af
Content-Type: application/json

--- request body ---
{"handle":"qa-05cc541b5154","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a487c36-b18c-46ad-a158-0ed0438176af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ea105401-3d16-4f70-be4a-05e46df83e03"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_a355b19b-fc0d-48f3-986b-dba847b5dba5
correlation: qa-22fedb9a-d0d5-4765-91d7-4b49d73eae11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22fedb9a-d0d5-4765-91d7-4b49d73eae11
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22fedb9a-d0d5-4765-91d7-4b49d73eae11
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a355b19b-fc0d-48f3-986b-dba847b5dba5","correlationId":"qa-22fedb9a-d0d5-4765-91d7-4b49d73eae11"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b33484f7-d6f9-4087-a6fb-1e6a221de175

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b33484f7-d6f9-4087-a6fb-1e6a221de175
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b33484f7-d6f9-4087-a6fb-1e6a221de175
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-8e711631-f3f6-4388-a1a1-53c24382acca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e711631-f3f6-4388-a1a1-53c24382acca
Content-Type: application/json

--- request body ---
{"handle":"qa-05cc541b5154","password":"****"}

--- response: 401 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e711631-f3f6-4388-a1a1-53c24382acca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8e711631-f3f6-4388-a1a1-53c24382acca"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-fd372e09-9156-44fd-97a0-312a823a6565

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd372e09-9156-44fd-97a0-312a823a6565
Content-Type: application/json

--- request body ---
{"handle":"qa-866b1547e7be","password":"****"}

--- response: 200 in 44 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd372e09-9156-44fd-97a0-312a823a6565
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_62636119-1bc5-48f0-aa6a-aa7497e192e6"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b12b324-e6ac-4694-a9ee-9ef0a8addf3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b12b324-e6ac-4694-a9ee-9ef0a8addf3f
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b12b324-e6ac-4694-a9ee-9ef0a8addf3f
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-67d0ca77-bcd0-44e2-8098-80e116fc9087

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67d0ca77-bcd0-44e2-8098-80e116fc9087
Content-Type: application/json

--- request body ---
{"handle":"qa-866b1547e7be","password":"****"}

--- response: 401 in 28 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67d0ca77-bcd0-44e2-8098-80e116fc9087
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67d0ca77-bcd0-44e2-8098-80e116fc9087"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0a9223c1-1354-4c2f-b769-474239073c41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a9223c1-1354-4c2f-b769-474239073c41
Content-Type: application/json

--- response: 204 in 56 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0a9223c1-1354-4c2f-b769-474239073c41
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-f415d521-5060-46b2-9935-ce64584b0b22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f415d521-5060-46b2-9935-ce64584b0b22
Content-Type: application/json

--- request body ---
{"handle":"qa-2b72d8191a6e","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f415d521-5060-46b2-9935-ce64584b0b22
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f415d521-5060-46b2-9935-ce64584b0b22"}
```
