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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-1ca85ea0-27de-4eb3-8b78-bd88475dbd88` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-4c089b41-5f53-49de-8422-f35bd391c5c7` |
| 3 | `POST /v1/accounts` | 201 | 20 | `qa-32a92642-8cce-42e2-ac40-046c7a0e7c33` |
| 4 | `POST /v1/auth/token` | 200 | 23 | `qa-5ffbd056-c095-40db-8b31-606465d31928` |
| 5 | `POST /v1/conversations` | 201 | 10 | `qa-d6173aca-3772-46ae-b94b-0e26924cd370` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-169c8d5b-1ee0-4304-93e8-c5bed83d1604` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 12 | `qa-467cf293-0beb-4557-96df-12c0de207708` |
| 8 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-0d60762f-5726-4cf4-84b8-1ac145b862d5` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-1a9350f0-275a-4b89-9fb0-f21a43a3bf55` |
| 10 | `POST /v1/auth/token` | 200 | 15 | `qa-f13d9f4f-422d-47b2-b72f-e0a2962be58c` |
| 11 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-5ed3862b-3d9c-4f5d-925f-06e3167f5cea` |
| 12 | `POST /v1/auth/token` | 401 | 40 | `qa-66e3b2d1-51de-46b4-8d71-c5c00420e4c9` |
| 13 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-0e942f23-ad9e-43aa-8a3c-477af2a22cfd` |
| 14 | `POST /v1/auth/token` | 401 | 16 | `qa-47cbf478-349e-4198-ba83-58ccd76d138e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1ca85ea0-27de-4eb3-8b78-bd88475dbd88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ca85ea0-27de-4eb3-8b78-bd88475dbd88
Content-Type: application/json

--- request body ---
{"handle":"qa-8c907f265ddb","displayName":"QA 8c907f265ddb","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ca85ea0-27de-4eb3-8b78-bd88475dbd88
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
Location: /v1/accounts/qa-8c907f265ddb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_261ef682-51fe-4d31-8437-2d24f1011407","handle":"qa-8c907f265ddb","displayName":"QA 8c907f265ddb","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.249228333Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4c089b41-5f53-49de-8422-f35bd391c5c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c089b41-5f53-49de-8422-f35bd391c5c7
Content-Type: application/json

--- request body ---
{"handle":"qa-76656e90a876","displayName":"QA 76656e90a876","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c089b41-5f53-49de-8422-f35bd391c5c7
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
Location: /v1/accounts/qa-76656e90a876
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8e93a8f7-d0ee-4bb5-957c-f22b4a64eece","handle":"qa-76656e90a876","displayName":"QA 76656e90a876","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.276758998Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-32a92642-8cce-42e2-ac40-046c7a0e7c33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32a92642-8cce-42e2-ac40-046c7a0e7c33
Content-Type: application/json

--- request body ---
{"handle":"qa-9ad571906470","displayName":"QA 9ad571906470","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-32a92642-8cce-42e2-ac40-046c7a0e7c33
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
Location: /v1/accounts/qa-9ad571906470
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cb9d48a4-6127-4519-942b-e64bcd018ce1","handle":"qa-9ad571906470","displayName":"QA 9ad571906470","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.303229683Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-5ffbd056-c095-40db-8b31-606465d31928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ffbd056-c095-40db-8b31-606465d31928
Content-Type: application/json

--- request body ---
{"handle":"qa-8c907f265ddb","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ffbd056-c095-40db-8b31-606465d31928
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_261ef682-51fe-4d31-8437-2d24f1011407"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d6173aca-3772-46ae-b94b-0e26924cd370

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6173aca-3772-46ae-b94b-0e26924cd370
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-76656e90a876","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6173aca-3772-46ae-b94b-0e26924cd370
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
Location: /v1/conversations/cnv_fde59b07-7584-4a10-a363-fa5b571d9644
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fde59b07-7584-4a10-a363-fa5b571d9644","subject":"Error contract","status":"open","region":"eu","participants":["qa-8c907f265ddb","qa-76656e90a876"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:10.370645554Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-169c8d5b-1ee0-4304-93e8-c5bed83d1604

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-169c8d5b-1ee0-4304-93e8-c5bed83d1604
Content-Type: application/json

--- request body ---
{"handle":"qa-9ad571906470","password":"****"}

--- response: 200 in 38 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-169c8d5b-1ee0-4304-93e8-c5bed83d1604
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb9d48a4-6127-4519-942b-e64bcd018ce1"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_fde59b07-7584-4a10-a363-fa5b571d9644/read
correlation: qa-467cf293-0beb-4557-96df-12c0de207708

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-467cf293-0beb-4557-96df-12c0de207708
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-467cf293-0beb-4557-96df-12c0de207708
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_fde59b07-7584-4a10-a363-fa5b571d9644/read","correlationId":"qa-467cf293-0beb-4557-96df-12c0de207708"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0d60762f-5726-4cf4-84b8-1ac145b862d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d60762f-5726-4cf4-84b8-1ac145b862d5
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0d60762f-5726-4cf4-84b8-1ac145b862d5
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
correlation: qa-1a9350f0-275a-4b89-9fb0-f21a43a3bf55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a9350f0-275a-4b89-9fb0-f21a43a3bf55
Content-Type: application/json

--- request body ---
{"handle":"qa-9ad571906470","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a9350f0-275a-4b89-9fb0-f21a43a3bf55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1a9350f0-275a-4b89-9fb0-f21a43a3bf55"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-f13d9f4f-422d-47b2-b72f-e0a2962be58c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f13d9f4f-422d-47b2-b72f-e0a2962be58c
Content-Type: application/json

--- request body ---
{"handle":"qa-76656e90a876","password":"****"}

--- response: 200 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-f13d9f4f-422d-47b2-b72f-e0a2962be58c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8e93a8f7-d0ee-4bb5-957c-f22b4a64eece"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5ed3862b-3d9c-4f5d-925f-06e3167f5cea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ed3862b-3d9c-4f5d-925f-06e3167f5cea
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5ed3862b-3d9c-4f5d-925f-06e3167f5cea
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
correlation: qa-66e3b2d1-51de-46b4-8d71-c5c00420e4c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66e3b2d1-51de-46b4-8d71-c5c00420e4c9
Content-Type: application/json

--- request body ---
{"handle":"qa-76656e90a876","password":"****"}

--- response: 401 in 40 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66e3b2d1-51de-46b4-8d71-c5c00420e4c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-66e3b2d1-51de-46b4-8d71-c5c00420e4c9"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0e942f23-ad9e-43aa-8a3c-477af2a22cfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e942f23-ad9e-43aa-8a3c-477af2a22cfd
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0e942f23-ad9e-43aa-8a3c-477af2a22cfd
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
correlation: qa-47cbf478-349e-4198-ba83-58ccd76d138e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47cbf478-349e-4198-ba83-58ccd76d138e
Content-Type: application/json

--- request body ---
{"handle":"qa-8c907f265ddb","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47cbf478-349e-4198-ba83-58ccd76d138e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-47cbf478-349e-4198-ba83-58ccd76d138e"}
```
