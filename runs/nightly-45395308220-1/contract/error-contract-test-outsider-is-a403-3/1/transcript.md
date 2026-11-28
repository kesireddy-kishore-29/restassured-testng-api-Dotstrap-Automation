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
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-fd6c8b6c-c956-4930-b759-5d179d4dace9` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-f0ba65a7-e066-443b-96f7-d4c139edcd5d` |
| 3 | `POST /v1/accounts` | 201 | 22 | `qa-9488b941-3b43-4ccc-9393-79257bb27fad` |
| 4 | `POST /v1/auth/token` | 200 | 26 | `qa-604d4cda-75de-463f-8f00-76377bf641f2` |
| 5 | `POST /v1/conversations` | 201 | 7 | `qa-da163cc2-1e94-45cb-a277-71d643f53f12` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-e0129f49-9632-401e-b0f8-91f80ae42d20` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 11 | `qa-ae2053ec-61bc-45f1-bf3d-91f4d9ad703e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-111fb2bf-b718-4598-845b-4f11cb788d3b` |
| 9 | `POST /v1/auth/token` | 401 | 25 | `qa-73760a5e-3731-491a-9983-48351988923b` |
| 10 | `POST /v1/auth/token` | 200 | 50 | `qa-9e7b6574-2dd9-41d1-b4c3-420a22d2c6e9` |
| 11 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-e377589b-dae2-4bf8-81f8-8f67c8edec69` |
| 12 | `POST /v1/auth/token` | 401 | 19 | `qa-9e2fde83-db70-467f-b67a-0de68836e103` |
| 13 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-e1354a12-72b9-4fec-a78f-96d33e32ae2b` |
| 14 | `POST /v1/auth/token` | 401 | 28 | `qa-8854eec6-9e4f-4f58-afa2-0d34110e2e72` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fd6c8b6c-c956-4930-b759-5d179d4dace9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd6c8b6c-c956-4930-b759-5d179d4dace9
Content-Type: application/json

--- request body ---
{"handle":"qa-9a63a5e7d769","displayName":"QA 9a63a5e7d769","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd6c8b6c-c956-4930-b759-5d179d4dace9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Location: /v1/accounts/qa-9a63a5e7d769
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8e1ed285-08d0-4f8f-9b48-5f98730c6f37","handle":"qa-9a63a5e7d769","displayName":"QA 9a63a5e7d769","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.364975229Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f0ba65a7-e066-443b-96f7-d4c139edcd5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0ba65a7-e066-443b-96f7-d4c139edcd5d
Content-Type: application/json

--- request body ---
{"handle":"qa-b5d7f610036d","displayName":"QA b5d7f610036d","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0ba65a7-e066-443b-96f7-d4c139edcd5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Location: /v1/accounts/qa-b5d7f610036d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f94a3ab0-7734-4b59-927a-7394b29661d2","handle":"qa-b5d7f610036d","displayName":"QA b5d7f610036d","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.392695357Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-9488b941-3b43-4ccc-9393-79257bb27fad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9488b941-3b43-4ccc-9393-79257bb27fad
Content-Type: application/json

--- request body ---
{"handle":"qa-58be2612cfe0","displayName":"QA 58be2612cfe0","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-9488b941-3b43-4ccc-9393-79257bb27fad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Location: /v1/accounts/qa-58be2612cfe0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8e06e769-f2ff-431e-b052-ed9ab8c8b209","handle":"qa-58be2612cfe0","displayName":"QA 58be2612cfe0","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.420806244Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-604d4cda-75de-463f-8f00-76377bf641f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-604d4cda-75de-463f-8f00-76377bf641f2
Content-Type: application/json

--- request body ---
{"handle":"qa-9a63a5e7d769","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-604d4cda-75de-463f-8f00-76377bf641f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8e1ed285-08d0-4f8f-9b48-5f98730c6f37"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-da163cc2-1e94-45cb-a277-71d643f53f12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da163cc2-1e94-45cb-a277-71d643f53f12
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b5d7f610036d","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-da163cc2-1e94-45cb-a277-71d643f53f12
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
Location: /v1/conversations/cnv_c2e3ebfd-38fc-4c08-b09f-2d037aa87b6b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c2e3ebfd-38fc-4c08-b09f-2d037aa87b6b","subject":"Error contract","status":"open","region":"eu","participants":["qa-9a63a5e7d769","qa-b5d7f610036d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:13.466247925Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e0129f49-9632-401e-b0f8-91f80ae42d20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0129f49-9632-401e-b0f8-91f80ae42d20
Content-Type: application/json

--- request body ---
{"handle":"qa-58be2612cfe0","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0129f49-9632-401e-b0f8-91f80ae42d20
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8e06e769-f2ff-431e-b052-ed9ab8c8b209"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_c2e3ebfd-38fc-4c08-b09f-2d037aa87b6b/read
correlation: qa-ae2053ec-61bc-45f1-bf3d-91f4d9ad703e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae2053ec-61bc-45f1-bf3d-91f4d9ad703e
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae2053ec-61bc-45f1-bf3d-91f4d9ad703e
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_c2e3ebfd-38fc-4c08-b09f-2d037aa87b6b/read","correlationId":"qa-ae2053ec-61bc-45f1-bf3d-91f4d9ad703e"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-111fb2bf-b718-4598-845b-4f11cb788d3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-111fb2bf-b718-4598-845b-4f11cb788d3b
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-111fb2bf-b718-4598-845b-4f11cb788d3b
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
correlation: qa-73760a5e-3731-491a-9983-48351988923b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73760a5e-3731-491a-9983-48351988923b
Content-Type: application/json

--- request body ---
{"handle":"qa-58be2612cfe0","password":"****"}

--- response: 401 in 25 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73760a5e-3731-491a-9983-48351988923b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-73760a5e-3731-491a-9983-48351988923b"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9e7b6574-2dd9-41d1-b4c3-420a22d2c6e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e7b6574-2dd9-41d1-b4c3-420a22d2c6e9
Content-Type: application/json

--- request body ---
{"handle":"qa-b5d7f610036d","password":"****"}

--- response: 200 in 50 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e7b6574-2dd9-41d1-b4c3-420a22d2c6e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f94a3ab0-7734-4b59-927a-7394b29661d2"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e377589b-dae2-4bf8-81f8-8f67c8edec69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e377589b-dae2-4bf8-81f8-8f67c8edec69
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e377589b-dae2-4bf8-81f8-8f67c8edec69
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
correlation: qa-9e2fde83-db70-467f-b67a-0de68836e103

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e2fde83-db70-467f-b67a-0de68836e103
Content-Type: application/json

--- request body ---
{"handle":"qa-b5d7f610036d","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9e2fde83-db70-467f-b67a-0de68836e103
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9e2fde83-db70-467f-b67a-0de68836e103"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e1354a12-72b9-4fec-a78f-96d33e32ae2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1354a12-72b9-4fec-a78f-96d33e32ae2b
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e1354a12-72b9-4fec-a78f-96d33e32ae2b
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
correlation: qa-8854eec6-9e4f-4f58-afa2-0d34110e2e72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8854eec6-9e4f-4f58-afa2-0d34110e2e72
Content-Type: application/json

--- request body ---
{"handle":"qa-9a63a5e7d769","password":"****"}

--- response: 401 in 28 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8854eec6-9e4f-4f58-afa2-0d34110e2e72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8854eec6-9e4f-4f58-afa2-0d34110e2e72"}
```
