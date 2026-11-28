# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-897a9051-f485-4d82-8390-3e3a46d822b9` |
| 2 | `POST /v1/accounts` | 201 | 83 | `qa-68ca71f2-e860-45dd-93c2-42942370786a` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-6c40e30a-d965-49bf-9b16-858a9e49756c` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-b55331ec-d30d-4ec4-8b77-149ea76edf7e` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 21 | `qa-4031abd3-6e29-427a-8f0d-858ebd9873ef` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-eac95e76-2697-455e-ba88-739fa62364b5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-faa3b60d-9d3a-4cac-bb18-a0457174304e` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-be451c2d-0800-4ec6-a8bc-d489a0f15287` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-96886172-e177-4fee-b5b8-82a457a95d51` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-47f267c1-f867-40d5-9f6f-6f45c92d8042` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-897a9051-f485-4d82-8390-3e3a46d822b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-897a9051-f485-4d82-8390-3e3a46d822b9
Content-Type: application/json

--- request body ---
{"handle":"qa-823e7a5ca737","displayName":"QA 823e7a5ca737","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-897a9051-f485-4d82-8390-3e3a46d822b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 7
Location: /v1/accounts/qa-823e7a5ca737
X-Served-Region: eu
Content-Length: 181

{"id":"acc_21e6d996-708b-42a7-9c67-8f6cc65376af","handle":"qa-823e7a5ca737","displayName":"QA 823e7a5ca737","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.485649745Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-68ca71f2-e860-45dd-93c2-42942370786a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68ca71f2-e860-45dd-93c2-42942370786a
Content-Type: application/json

--- request body ---
{"handle":"qa-d85a33a12af3","displayName":"QA d85a33a12af3","password":"****","region":"eu"}

--- response: 201 in 83 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-68ca71f2-e860-45dd-93c2-42942370786a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 7
Location: /v1/accounts/qa-d85a33a12af3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dd0267fe-503e-42c2-a2d1-5ee61ec697c8","handle":"qa-d85a33a12af3","displayName":"QA d85a33a12af3","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.571586412Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6c40e30a-d965-49bf-9b16-858a9e49756c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c40e30a-d965-49bf-9b16-858a9e49756c
Content-Type: application/json

--- request body ---
{"handle":"qa-823e7a5ca737","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c40e30a-d965-49bf-9b16-858a9e49756c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_21e6d996-708b-42a7-9c67-8f6cc65376af"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b55331ec-d30d-4ec4-8b77-149ea76edf7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b55331ec-d30d-4ec4-8b77-149ea76edf7e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d85a33a12af3","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-b55331ec-d30d-4ec4-8b77-149ea76edf7e
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
Location: /v1/conversations/cnv_3fe4aebc-15fe-4f70-bfc5-75d6f98452a7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3fe4aebc-15fe-4f70-bfc5-75d6f98452a7","subject":"Error contract","status":"open","region":"eu","participants":["qa-823e7a5ca737","qa-d85a33a12af3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.610713734Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_3fe4aebc-15fe-4f70-bfc5-75d6f98452a7/messages
correlation: qa-4031abd3-6e29-427a-8f0d-858ebd9873ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4031abd3-6e29-427a-8f0d-858ebd9873ef
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 21 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4031abd3-6e29-427a-8f0d-858ebd9873ef
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_3fe4aebc-15fe-4f70-bfc5-75d6f98452a7/messages","correlationId":"qa-4031abd3-6e29-427a-8f0d-858ebd9873ef","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-eac95e76-2697-455e-ba88-739fa62364b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eac95e76-2697-455e-ba88-739fa62364b5
Content-Type: application/json

--- request body ---
{"handle":"qa-d85a33a12af3","password":"****"}

--- response: 200 in 42 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-eac95e76-2697-455e-ba88-739fa62364b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dd0267fe-503e-42c2-a2d1-5ee61ec697c8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-faa3b60d-9d3a-4cac-bb18-a0457174304e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faa3b60d-9d3a-4cac-bb18-a0457174304e
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-faa3b60d-9d3a-4cac-bb18-a0457174304e
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
correlation: qa-be451c2d-0800-4ec6-a8bc-d489a0f15287

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be451c2d-0800-4ec6-a8bc-d489a0f15287
Content-Type: application/json

--- request body ---
{"handle":"qa-d85a33a12af3","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be451c2d-0800-4ec6-a8bc-d489a0f15287
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-be451c2d-0800-4ec6-a8bc-d489a0f15287"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-96886172-e177-4fee-b5b8-82a457a95d51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96886172-e177-4fee-b5b8-82a457a95d51
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-96886172-e177-4fee-b5b8-82a457a95d51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-47f267c1-f867-40d5-9f6f-6f45c92d8042

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47f267c1-f867-40d5-9f6f-6f45c92d8042
Content-Type: application/json

--- request body ---
{"handle":"qa-823e7a5ca737","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47f267c1-f867-40d5-9f6f-6f45c92d8042
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-47f267c1-f867-40d5-9f6f-6f45c92d8042"}
```
