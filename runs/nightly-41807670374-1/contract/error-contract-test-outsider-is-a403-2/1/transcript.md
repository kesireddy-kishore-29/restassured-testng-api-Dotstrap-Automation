# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 446 | `qa-70fc07df-9093-4287-8e1d-17ac33f1f0d6` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-a585adf6-8469-4a8d-a4c8-50b97b51e871` |
| 3 | `POST /v1/accounts` | 201 | 21 | `qa-fd0f4d99-5c8c-48c8-aa1e-27e5b8ee4b2e` |
| 4 | `POST /v1/auth/token` | 200 | 35 | `qa-0fb24989-4a55-4dd7-b795-cbb9792a0e6e` |
| 5 | `POST /v1/conversations` | 201 | 15 | `qa-bec195dc-e109-4200-a5cb-eef7d572156c` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-5ae11a75-f02d-4f95-864a-ee7d4b409bf7` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 13 | `qa-0c890d68-9311-45db-a82f-a751c5c62198` |
| 8 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-4619f124-8580-4675-a648-8ee36c48b59e` |
| 9 | `POST /v1/auth/token` | 401 | 53 | `qa-e0acff33-6a8a-44ee-b469-537270ee56e1` |
| 10 | `POST /v1/auth/token` | 200 | 31 | `qa-c8bc1ad2-363c-483a-a4d5-816f8e73ecd4` |
| 11 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-b509fb52-eda6-4272-8291-e9505616faaf` |
| 12 | `POST /v1/auth/token` | 401 | 14 | `qa-5363f86f-f5e2-4641-8e90-ed85a0a0a1bf` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-0b705cce-b0a9-4682-a4d5-d91db76e06e1` |
| 14 | `POST /v1/auth/token` | 401 | 13 | `qa-e13d3a6e-672e-4c7c-88ba-cbd18bc374ea` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-70fc07df-9093-4287-8e1d-17ac33f1f0d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70fc07df-9093-4287-8e1d-17ac33f1f0d6
Content-Type: application/json

--- request body ---
{"handle":"qa-d603a4668437","displayName":"QA d603a4668437","password":"****","region":"eu"}

--- response: 201 in 446 ms ---
Date: Wed, 04 Nov 2026 09:28:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-70fc07df-9093-4287-8e1d-17ac33f1f0d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-d603a4668437
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4deb9a3e-bd59-4c8e-bede-d7ed97a84a2e","handle":"qa-d603a4668437","displayName":"QA d603a4668437","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.107914934Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a585adf6-8469-4a8d-a4c8-50b97b51e871

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a585adf6-8469-4a8d-a4c8-50b97b51e871
Content-Type: application/json

--- request body ---
{"handle":"qa-65ad7eb57fa3","displayName":"QA 65ad7eb57fa3","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a585adf6-8469-4a8d-a4c8-50b97b51e871
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Location: /v1/accounts/qa-65ad7eb57fa3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_135cde40-c46a-48f4-a76c-3d96914ae37d","handle":"qa-65ad7eb57fa3","displayName":"QA 65ad7eb57fa3","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.408003621Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-fd0f4d99-5c8c-48c8-aa1e-27e5b8ee4b2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd0f4d99-5c8c-48c8-aa1e-27e5b8ee4b2e
Content-Type: application/json

--- request body ---
{"handle":"qa-6b9917ebf36b","displayName":"QA 6b9917ebf36b","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd0f4d99-5c8c-48c8-aa1e-27e5b8ee4b2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Location: /v1/accounts/qa-6b9917ebf36b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5a61dcca-f4f3-40d8-851a-a433e1e769e1","handle":"qa-6b9917ebf36b","displayName":"QA 6b9917ebf36b","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.453357959Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0fb24989-4a55-4dd7-b795-cbb9792a0e6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fb24989-4a55-4dd7-b795-cbb9792a0e6e
Content-Type: application/json

--- request body ---
{"handle":"qa-d603a4668437","password":"****"}

--- response: 200 in 35 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fb24989-4a55-4dd7-b795-cbb9792a0e6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4deb9a3e-bd59-4c8e-bede-d7ed97a84a2e"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-bec195dc-e109-4200-a5cb-eef7d572156c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bec195dc-e109-4200-a5cb-eef7d572156c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-65ad7eb57fa3","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-bec195dc-e109-4200-a5cb-eef7d572156c
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
Location: /v1/conversations/cnv_2e24112f-d0fa-4ac9-b292-0a3b77227760
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2e24112f-d0fa-4ac9-b292-0a3b77227760","subject":"Error contract","status":"open","region":"eu","participants":["qa-d603a4668437","qa-65ad7eb57fa3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:01.532203505Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5ae11a75-f02d-4f95-864a-ee7d4b409bf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ae11a75-f02d-4f95-864a-ee7d4b409bf7
Content-Type: application/json

--- request body ---
{"handle":"qa-6b9917ebf36b","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ae11a75-f02d-4f95-864a-ee7d4b409bf7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5a61dcca-f4f3-40d8-851a-a433e1e769e1"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_2e24112f-d0fa-4ac9-b292-0a3b77227760/messages
correlation: qa-0c890d68-9311-45db-a82f-a751c5c62198

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c890d68-9311-45db-a82f-a751c5c62198
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c890d68-9311-45db-a82f-a751c5c62198
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_2e24112f-d0fa-4ac9-b292-0a3b77227760/messages","correlationId":"qa-0c890d68-9311-45db-a82f-a751c5c62198"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4619f124-8580-4675-a648-8ee36c48b59e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4619f124-8580-4675-a648-8ee36c48b59e
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4619f124-8580-4675-a648-8ee36c48b59e
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
correlation: qa-e0acff33-6a8a-44ee-b469-537270ee56e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0acff33-6a8a-44ee-b469-537270ee56e1
Content-Type: application/json

--- request body ---
{"handle":"qa-6b9917ebf36b","password":"****"}

--- response: 401 in 53 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0acff33-6a8a-44ee-b469-537270ee56e1
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e0acff33-6a8a-44ee-b469-537270ee56e1"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c8bc1ad2-363c-483a-a4d5-816f8e73ecd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8bc1ad2-363c-483a-a4d5-816f8e73ecd4
Content-Type: application/json

--- request body ---
{"handle":"qa-65ad7eb57fa3","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8bc1ad2-363c-483a-a4d5-816f8e73ecd4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_135cde40-c46a-48f4-a76c-3d96914ae37d"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b509fb52-eda6-4272-8291-e9505616faaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b509fb52-eda6-4272-8291-e9505616faaf
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b509fb52-eda6-4272-8291-e9505616faaf
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
correlation: qa-5363f86f-f5e2-4641-8e90-ed85a0a0a1bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5363f86f-f5e2-4641-8e90-ed85a0a0a1bf
Content-Type: application/json

--- request body ---
{"handle":"qa-65ad7eb57fa3","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5363f86f-f5e2-4641-8e90-ed85a0a0a1bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5363f86f-f5e2-4641-8e90-ed85a0a0a1bf"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b705cce-b0a9-4682-a4d5-d91db76e06e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b705cce-b0a9-4682-a4d5-d91db76e06e1
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b705cce-b0a9-4682-a4d5-d91db76e06e1
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
correlation: qa-e13d3a6e-672e-4c7c-88ba-cbd18bc374ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e13d3a6e-672e-4c7c-88ba-cbd18bc374ea
Content-Type: application/json

--- request body ---
{"handle":"qa-d603a4668437","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e13d3a6e-672e-4c7c-88ba-cbd18bc374ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e13d3a6e-672e-4c7c-88ba-cbd18bc374ea"}
```
