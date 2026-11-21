# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-3bb70ce0-ba0b-400c-8e3d-443b23cc8c5f` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-fdb9b0c5-5c7e-4d3b-9f6a-2cfb6014b528` |
| 3 | `POST /v1/accounts` | 201 | 40 | `qa-8543e3c4-0833-4980-83cd-212ae8dd4a9c` |
| 4 | `POST /v1/auth/token` | 200 | 22 | `qa-b4406f50-ded4-4b73-b19f-a90d8084db7f` |
| 5 | `POST /v1/conversations` | 201 | 11 | `qa-9f5fe0e0-6756-483b-a005-2cb0776baf48` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-f0cc4ea4-6266-4e82-b3e5-0c673f4a5ca9` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 15 | `qa-5779f03a-466d-4b5e-9ba7-368456ec957a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-35c0413f-3cd4-4b54-9c99-7ece17b06ae5` |
| 9 | `POST /v1/auth/token` | 401 | 27 | `qa-c569d0ba-42ac-4f84-9580-41a082829330` |
| 10 | `POST /v1/auth/token` | 200 | 60 | `qa-ef770e97-26be-484e-9eb3-1a5d3edc61c3` |
| 11 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-8cb170f2-6725-44fc-9945-ccf8e1a84b64` |
| 12 | `POST /v1/auth/token` | 401 | 23 | `qa-55ecfb1f-3e92-4dbf-8b71-ab5ba33b1e83` |
| 13 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-43d28e79-687f-4af1-8d9c-0f46c34d571d` |
| 14 | `POST /v1/auth/token` | 401 | 56 | `qa-ae7721ec-9578-40b0-afaa-d9fdd203e647` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3bb70ce0-ba0b-400c-8e3d-443b23cc8c5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bb70ce0-ba0b-400c-8e3d-443b23cc8c5f
Content-Type: application/json

--- request body ---
{"handle":"qa-777ffaeec2ce","displayName":"QA 777ffaeec2ce","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bb70ce0-ba0b-400c-8e3d-443b23cc8c5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Location: /v1/accounts/qa-777ffaeec2ce
X-Served-Region: eu
Content-Length: 181

{"id":"acc_accb67c9-691d-4205-a0d0-98fc3a84a740","handle":"qa-777ffaeec2ce","displayName":"QA 777ffaeec2ce","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.825630782Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fdb9b0c5-5c7e-4d3b-9f6a-2cfb6014b528

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdb9b0c5-5c7e-4d3b-9f6a-2cfb6014b528
Content-Type: application/json

--- request body ---
{"handle":"qa-2d2f54042d49","displayName":"QA 2d2f54042d49","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdb9b0c5-5c7e-4d3b-9f6a-2cfb6014b528
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Location: /v1/accounts/qa-2d2f54042d49
X-Served-Region: eu
Content-Length: 181

{"id":"acc_22563060-1abb-4dce-8cee-55a45117158e","handle":"qa-2d2f54042d49","displayName":"QA 2d2f54042d49","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.852300070Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-8543e3c4-0833-4980-83cd-212ae8dd4a9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8543e3c4-0833-4980-83cd-212ae8dd4a9c
Content-Type: application/json

--- request body ---
{"handle":"qa-a14ee135f8dc","displayName":"QA a14ee135f8dc","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-8543e3c4-0833-4980-83cd-212ae8dd4a9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Location: /v1/accounts/qa-a14ee135f8dc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a6dbf51-2d62-4141-912b-39472abaeb77","handle":"qa-a14ee135f8dc","displayName":"QA a14ee135f8dc","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.910188474Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-b4406f50-ded4-4b73-b19f-a90d8084db7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4406f50-ded4-4b73-b19f-a90d8084db7f
Content-Type: application/json

--- request body ---
{"handle":"qa-777ffaeec2ce","password":"****"}

--- response: 200 in 22 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4406f50-ded4-4b73-b19f-a90d8084db7f
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_accb67c9-691d-4205-a0d0-98fc3a84a740"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-9f5fe0e0-6756-483b-a005-2cb0776baf48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f5fe0e0-6756-483b-a005-2cb0776baf48
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2d2f54042d49","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f5fe0e0-6756-483b-a005-2cb0776baf48
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
Location: /v1/conversations/cnv_26d78cf6-6c0e-4939-8565-c01eef54cb70
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_26d78cf6-6c0e-4939-8565-c01eef54cb70","subject":"Error contract","status":"open","region":"eu","participants":["qa-777ffaeec2ce","qa-2d2f54042d49"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:23.985818669Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f0cc4ea4-6266-4e82-b3e5-0c673f4a5ca9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0cc4ea4-6266-4e82-b3e5-0c673f4a5ca9
Content-Type: application/json

--- request body ---
{"handle":"qa-a14ee135f8dc","password":"****"}

--- response: 200 in 37 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0cc4ea4-6266-4e82-b3e5-0c673f4a5ca9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a6dbf51-2d62-4141-912b-39472abaeb77"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_26d78cf6-6c0e-4939-8565-c01eef54cb70/read
correlation: qa-5779f03a-466d-4b5e-9ba7-368456ec957a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5779f03a-466d-4b5e-9ba7-368456ec957a
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5779f03a-466d-4b5e-9ba7-368456ec957a
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_26d78cf6-6c0e-4939-8565-c01eef54cb70/read","correlationId":"qa-5779f03a-466d-4b5e-9ba7-368456ec957a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35c0413f-3cd4-4b54-9c99-7ece17b06ae5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35c0413f-3cd4-4b54-9c99-7ece17b06ae5
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35c0413f-3cd4-4b54-9c99-7ece17b06ae5
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
correlation: qa-c569d0ba-42ac-4f84-9580-41a082829330

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c569d0ba-42ac-4f84-9580-41a082829330
Content-Type: application/json

--- request body ---
{"handle":"qa-a14ee135f8dc","password":"****"}

--- response: 401 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c569d0ba-42ac-4f84-9580-41a082829330
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c569d0ba-42ac-4f84-9580-41a082829330"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ef770e97-26be-484e-9eb3-1a5d3edc61c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef770e97-26be-484e-9eb3-1a5d3edc61c3
Content-Type: application/json

--- request body ---
{"handle":"qa-2d2f54042d49","password":"****"}

--- response: 200 in 60 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef770e97-26be-484e-9eb3-1a5d3edc61c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_22563060-1abb-4dce-8cee-55a45117158e"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8cb170f2-6725-44fc-9945-ccf8e1a84b64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cb170f2-6725-44fc-9945-ccf8e1a84b64
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8cb170f2-6725-44fc-9945-ccf8e1a84b64
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
correlation: qa-55ecfb1f-3e92-4dbf-8b71-ab5ba33b1e83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55ecfb1f-3e92-4dbf-8b71-ab5ba33b1e83
Content-Type: application/json

--- request body ---
{"handle":"qa-2d2f54042d49","password":"****"}

--- response: 401 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55ecfb1f-3e92-4dbf-8b71-ab5ba33b1e83
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-55ecfb1f-3e92-4dbf-8b71-ab5ba33b1e83"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-43d28e79-687f-4af1-8d9c-0f46c34d571d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43d28e79-687f-4af1-8d9c-0f46c34d571d
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-43d28e79-687f-4af1-8d9c-0f46c34d571d
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
correlation: qa-ae7721ec-9578-40b0-afaa-d9fdd203e647

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae7721ec-9578-40b0-afaa-d9fdd203e647
Content-Type: application/json

--- request body ---
{"handle":"qa-777ffaeec2ce","password":"****"}

--- response: 401 in 56 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae7721ec-9578-40b0-afaa-d9fdd203e647
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ae7721ec-9578-40b0-afaa-d9fdd203e647"}
```
