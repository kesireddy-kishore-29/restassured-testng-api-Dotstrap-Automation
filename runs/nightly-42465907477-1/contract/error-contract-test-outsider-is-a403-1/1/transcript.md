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
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-7feb479b-2a56-49e9-8509-056a79c9cb58` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-cb6dafb6-d9bc-466e-ba4a-03ee370edae5` |
| 3 | `POST /v1/accounts` | 201 | 19 | `qa-a14ce4c3-5c79-4cb5-8708-4341ba1d41b5` |
| 4 | `POST /v1/auth/token` | 200 | 27 | `qa-e2e28640-552c-4fc0-9e41-213678a58ccf` |
| 5 | `POST /v1/conversations` | 201 | 7 | `qa-7d3eee9d-3fb1-4873-82cb-b5246e188746` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-959a7eab-4b50-4fbe-a6df-fced50e7c331` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 13 | `qa-93545ffd-b976-4576-9f68-cb2456a8d685` |
| 8 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-e206c2f8-409e-4a9f-888c-3634369de13e` |
| 9 | `POST /v1/auth/token` | 401 | 11 | `qa-bc5d86b9-9cf5-489d-9e1e-65f822b6006c` |
| 10 | `POST /v1/auth/token` | 200 | 30 | `qa-019f1a1e-fb4f-4153-ae93-ca9318aa9b5d` |
| 11 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-8431b5d8-7de6-483d-a963-4ee22a1db1d2` |
| 12 | `POST /v1/auth/token` | 401 | 14 | `qa-a30a1a3e-aa23-4726-b8c5-270176a7099b` |
| 13 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-45881b74-6893-40c0-9922-44e207d5be66` |
| 14 | `POST /v1/auth/token` | 401 | 15 | `qa-b61e71f5-23aa-4a42-b224-3bf8fb15f4ff` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7feb479b-2a56-49e9-8509-056a79c9cb58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7feb479b-2a56-49e9-8509-056a79c9cb58
Content-Type: application/json

--- request body ---
{"handle":"qa-6afed27ea9c7","displayName":"QA 6afed27ea9c7","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-7feb479b-2a56-49e9-8509-056a79c9cb58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Location: /v1/accounts/qa-6afed27ea9c7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_736ecccb-96b2-4c62-8a1e-dc49ea04e5aa","handle":"qa-6afed27ea9c7","displayName":"QA 6afed27ea9c7","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.763380585Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cb6dafb6-d9bc-466e-ba4a-03ee370edae5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb6dafb6-d9bc-466e-ba4a-03ee370edae5
Content-Type: application/json

--- request body ---
{"handle":"qa-f12d05c10a9c","displayName":"QA f12d05c10a9c","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb6dafb6-d9bc-466e-ba4a-03ee370edae5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 10
Location: /v1/accounts/qa-f12d05c10a9c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_90e3ea88-352a-4da4-8c59-12f9e259a378","handle":"qa-f12d05c10a9c","displayName":"QA f12d05c10a9c","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.830810165Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-a14ce4c3-5c79-4cb5-8708-4341ba1d41b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a14ce4c3-5c79-4cb5-8708-4341ba1d41b5
Content-Type: application/json

--- request body ---
{"handle":"qa-f2f33afbd043","displayName":"QA f2f33afbd043","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a14ce4c3-5c79-4cb5-8708-4341ba1d41b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 10
Location: /v1/accounts/qa-f2f33afbd043
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0731c63b-b179-46aa-a923-b30c42c37c62","handle":"qa-f2f33afbd043","displayName":"QA f2f33afbd043","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.871127846Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e2e28640-552c-4fc0-9e41-213678a58ccf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2e28640-552c-4fc0-9e41-213678a58ccf
Content-Type: application/json

--- request body ---
{"handle":"qa-6afed27ea9c7","password":"****"}

--- response: 200 in 27 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2e28640-552c-4fc0-9e41-213678a58ccf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_736ecccb-96b2-4c62-8a1e-dc49ea04e5aa"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-7d3eee9d-3fb1-4873-82cb-b5246e188746

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d3eee9d-3fb1-4873-82cb-b5246e188746
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f12d05c10a9c","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d3eee9d-3fb1-4873-82cb-b5246e188746
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
Location: /v1/conversations/cnv_2c87751d-1ac8-453d-90c6-cc4812df1267
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2c87751d-1ac8-453d-90c6-cc4812df1267","subject":"Error contract","status":"open","region":"eu","participants":["qa-6afed27ea9c7","qa-f12d05c10a9c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.922416302Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-959a7eab-4b50-4fbe-a6df-fced50e7c331

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-959a7eab-4b50-4fbe-a6df-fced50e7c331
Content-Type: application/json

--- request body ---
{"handle":"qa-f2f33afbd043","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-959a7eab-4b50-4fbe-a6df-fced50e7c331
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0731c63b-b179-46aa-a923-b30c42c37c62"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_2c87751d-1ac8-453d-90c6-cc4812df1267/messages
correlation: qa-93545ffd-b976-4576-9f68-cb2456a8d685

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93545ffd-b976-4576-9f68-cb2456a8d685
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93545ffd-b976-4576-9f68-cb2456a8d685
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_2c87751d-1ac8-453d-90c6-cc4812df1267/messages","correlationId":"qa-93545ffd-b976-4576-9f68-cb2456a8d685"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e206c2f8-409e-4a9f-888c-3634369de13e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e206c2f8-409e-4a9f-888c-3634369de13e
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e206c2f8-409e-4a9f-888c-3634369de13e
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
correlation: qa-bc5d86b9-9cf5-489d-9e1e-65f822b6006c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc5d86b9-9cf5-489d-9e1e-65f822b6006c
Content-Type: application/json

--- request body ---
{"handle":"qa-f2f33afbd043","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc5d86b9-9cf5-489d-9e1e-65f822b6006c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bc5d86b9-9cf5-489d-9e1e-65f822b6006c"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-019f1a1e-fb4f-4153-ae93-ca9318aa9b5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-019f1a1e-fb4f-4153-ae93-ca9318aa9b5d
Content-Type: application/json

--- request body ---
{"handle":"qa-f12d05c10a9c","password":"****"}

--- response: 200 in 30 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-019f1a1e-fb4f-4153-ae93-ca9318aa9b5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_90e3ea88-352a-4da4-8c59-12f9e259a378"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8431b5d8-7de6-483d-a963-4ee22a1db1d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8431b5d8-7de6-483d-a963-4ee22a1db1d2
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8431b5d8-7de6-483d-a963-4ee22a1db1d2
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
correlation: qa-a30a1a3e-aa23-4726-b8c5-270176a7099b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a30a1a3e-aa23-4726-b8c5-270176a7099b
Content-Type: application/json

--- request body ---
{"handle":"qa-f12d05c10a9c","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a30a1a3e-aa23-4726-b8c5-270176a7099b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a30a1a3e-aa23-4726-b8c5-270176a7099b"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-45881b74-6893-40c0-9922-44e207d5be66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45881b74-6893-40c0-9922-44e207d5be66
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-45881b74-6893-40c0-9922-44e207d5be66
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
correlation: qa-b61e71f5-23aa-4a42-b224-3bf8fb15f4ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b61e71f5-23aa-4a42-b224-3bf8fb15f4ff
Content-Type: application/json

--- request body ---
{"handle":"qa-6afed27ea9c7","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b61e71f5-23aa-4a42-b224-3bf8fb15f4ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b61e71f5-23aa-4a42-b224-3bf8fb15f4ff"}
```
