# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 420 | `qa-a6298f8e-3f87-4853-9265-d3c1b6021e59` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-6df8e6fc-1a86-46ca-87dc-748883e577bf` |
| 3 | `POST /v1/accounts` | 201 | 54 | `qa-87046c7c-f6c7-42ea-aa8a-2679fa220f28` |
| 4 | `POST /v1/auth/token` | 200 | 17 | `qa-02b395c4-a81f-4eb2-956f-51115d20e911` |
| 5 | `POST /v1/conversations` | 201 | 33 | `qa-738e7c7f-d94e-4de0-80bc-8ee7fd23936b` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-34b32650-3b4b-4c99-a08e-b166c89ef8d7` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 12 | `qa-1aa97b3a-e5b2-4b5c-8764-b79b52e317cd` |
| 8 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-1714ab43-a56e-4262-ab76-3029a4005f50` |
| 9 | `POST /v1/auth/token` | 401 | 44 | `qa-3ea439a7-d3b9-4b9e-af85-f836dbde571d` |
| 10 | `POST /v1/auth/token` | 200 | 17 | `qa-8a17050f-91c5-40f3-989a-1bd249e43d1d` |
| 11 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-e23c0fe3-c96d-4264-b89c-8ddb7f624076` |
| 12 | `POST /v1/auth/token` | 401 | 5 | `qa-824484ff-c435-4bde-8fcb-d6522998f140` |
| 13 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-45bf1e75-7120-47d3-8ae6-29f68eac9a51` |
| 14 | `POST /v1/auth/token` | 401 | 7 | `qa-1839fdd6-d1dd-465e-8c2b-b47eb94ca35a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a6298f8e-3f87-4853-9265-d3c1b6021e59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6298f8e-3f87-4853-9265-d3c1b6021e59
Content-Type: application/json

--- request body ---
{"handle":"qa-4a7224a3c216","displayName":"QA 4a7224a3c216","password":"****","region":"eu"}

--- response: 201 in 420 ms ---
Date: Wed, 04 Nov 2026 09:28:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6298f8e-3f87-4853-9265-d3c1b6021e59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-4a7224a3c216
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eb9dea85-7ddf-40ea-b827-2fddec6151a8","handle":"qa-4a7224a3c216","displayName":"QA 4a7224a3c216","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.025747549Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6df8e6fc-1a86-46ca-87dc-748883e577bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6df8e6fc-1a86-46ca-87dc-748883e577bf
Content-Type: application/json

--- request body ---
{"handle":"qa-e0c9802f129b","displayName":"QA e0c9802f129b","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-6df8e6fc-1a86-46ca-87dc-748883e577bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-e0c9802f129b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a2bb8a37-127a-4726-a2f0-b3ed33f318f6","handle":"qa-e0c9802f129b","displayName":"QA e0c9802f129b","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.387865046Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-87046c7c-f6c7-42ea-aa8a-2679fa220f28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87046c7c-f6c7-42ea-aa8a-2679fa220f28
Content-Type: application/json

--- request body ---
{"handle":"qa-fa947d473574","displayName":"QA fa947d473574","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-87046c7c-f6c7-42ea-aa8a-2679fa220f28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-fa947d473574
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6ad5a948-4064-4f71-904d-1bcb2a653569","handle":"qa-fa947d473574","displayName":"QA fa947d473574","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.449143890Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-02b395c4-a81f-4eb2-956f-51115d20e911

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02b395c4-a81f-4eb2-956f-51115d20e911
Content-Type: application/json

--- request body ---
{"handle":"qa-4a7224a3c216","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-02b395c4-a81f-4eb2-956f-51115d20e911
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb9dea85-7ddf-40ea-b827-2fddec6151a8"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-738e7c7f-d94e-4de0-80bc-8ee7fd23936b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-738e7c7f-d94e-4de0-80bc-8ee7fd23936b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e0c9802f129b","subject":"Error contract","message":"Hi"}

--- response: 201 in 33 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-738e7c7f-d94e-4de0-80bc-8ee7fd23936b
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
Location: /v1/conversations/cnv_90d6683e-16bd-4b2f-98b0-9ea448f6a17d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_90d6683e-16bd-4b2f-98b0-9ea448f6a17d","subject":"Error contract","status":"open","region":"eu","participants":["qa-4a7224a3c216","qa-e0c9802f129b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:01.526617924Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-34b32650-3b4b-4c99-a08e-b166c89ef8d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34b32650-3b4b-4c99-a08e-b166c89ef8d7
Content-Type: application/json

--- request body ---
{"handle":"qa-fa947d473574","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-34b32650-3b4b-4c99-a08e-b166c89ef8d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6ad5a948-4064-4f71-904d-1bcb2a653569"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_90d6683e-16bd-4b2f-98b0-9ea448f6a17d/messages
correlation: qa-1aa97b3a-e5b2-4b5c-8764-b79b52e317cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1aa97b3a-e5b2-4b5c-8764-b79b52e317cd
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1aa97b3a-e5b2-4b5c-8764-b79b52e317cd
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_90d6683e-16bd-4b2f-98b0-9ea448f6a17d/messages","correlationId":"qa-1aa97b3a-e5b2-4b5c-8764-b79b52e317cd"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1714ab43-a56e-4262-ab76-3029a4005f50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1714ab43-a56e-4262-ab76-3029a4005f50
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1714ab43-a56e-4262-ab76-3029a4005f50
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
correlation: qa-3ea439a7-d3b9-4b9e-af85-f836dbde571d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ea439a7-d3b9-4b9e-af85-f836dbde571d
Content-Type: application/json

--- request body ---
{"handle":"qa-fa947d473574","password":"****"}

--- response: 401 in 44 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ea439a7-d3b9-4b9e-af85-f836dbde571d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3ea439a7-d3b9-4b9e-af85-f836dbde571d"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8a17050f-91c5-40f3-989a-1bd249e43d1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a17050f-91c5-40f3-989a-1bd249e43d1d
Content-Type: application/json

--- request body ---
{"handle":"qa-e0c9802f129b","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a17050f-91c5-40f3-989a-1bd249e43d1d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a2bb8a37-127a-4726-a2f0-b3ed33f318f6"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e23c0fe3-c96d-4264-b89c-8ddb7f624076

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e23c0fe3-c96d-4264-b89c-8ddb7f624076
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e23c0fe3-c96d-4264-b89c-8ddb7f624076
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
correlation: qa-824484ff-c435-4bde-8fcb-d6522998f140

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-824484ff-c435-4bde-8fcb-d6522998f140
Content-Type: application/json

--- request body ---
{"handle":"qa-e0c9802f129b","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-824484ff-c435-4bde-8fcb-d6522998f140
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-824484ff-c435-4bde-8fcb-d6522998f140"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-45bf1e75-7120-47d3-8ae6-29f68eac9a51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45bf1e75-7120-47d3-8ae6-29f68eac9a51
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-45bf1e75-7120-47d3-8ae6-29f68eac9a51
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-1839fdd6-d1dd-465e-8c2b-b47eb94ca35a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1839fdd6-d1dd-465e-8c2b-b47eb94ca35a
Content-Type: application/json

--- request body ---
{"handle":"qa-4a7224a3c216","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1839fdd6-d1dd-465e-8c2b-b47eb94ca35a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1839fdd6-d1dd-465e-8c2b-b47eb94ca35a"}
```
