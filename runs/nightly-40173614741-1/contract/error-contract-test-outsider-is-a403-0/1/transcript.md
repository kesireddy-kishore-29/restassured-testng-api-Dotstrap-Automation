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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-7e3ff21e-8f12-4c0e-a957-957ebfe1b34a` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-643a6f7b-6c4e-4d63-a91c-0ff29f5ce5ff` |
| 3 | `POST /v1/accounts` | 201 | 17 | `qa-b828e7f0-163e-4944-a9df-57c1587950a4` |
| 4 | `POST /v1/auth/token` | 200 | 31 | `qa-8762b0bb-5004-46ff-b63a-34baf0e0a86f` |
| 5 | `POST /v1/conversations` | 201 | 23 | `qa-316fc4d2-3d7e-476d-8218-0e463206b029` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-5fed4d13-9146-49ca-9c58-24a27608fbe3` |
| 7 | `GET /v1/conversations/{id}` | 403 | 28 | `qa-66ef87a8-73d7-4d48-8737-53d32248a06a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-cc0ff618-bec5-481c-8ed3-8c2761770f03` |
| 9 | `POST /v1/auth/token` | 401 | 24 | `qa-807a9af2-92c2-48ee-8a38-6b7e1ffc6dee` |
| 10 | `POST /v1/auth/token` | 200 | 40 | `qa-e740d8bc-48c9-4b68-9616-f6cd6b1f208e` |
| 11 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-021a1902-a1e4-4a67-b451-07a658a0ef72` |
| 12 | `POST /v1/auth/token` | 401 | 48 | `qa-0d895b50-b79e-4e5e-af89-269e71931c9b` |
| 13 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-719957c7-8f6f-4c12-9807-f15fb333dc09` |
| 14 | `POST /v1/auth/token` | 401 | 14 | `qa-76341fc0-2153-46e0-b6d7-1a0a83e95e7e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7e3ff21e-8f12-4c0e-a957-957ebfe1b34a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e3ff21e-8f12-4c0e-a957-957ebfe1b34a
Content-Type: application/json

--- request body ---
{"handle":"qa-d7daf2b213c2","displayName":"QA d7daf2b213c2","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e3ff21e-8f12-4c0e-a957-957ebfe1b34a
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
Location: /v1/accounts/qa-d7daf2b213c2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72030e7e-7092-4fc4-a327-4af8c58a1f6d","handle":"qa-d7daf2b213c2","displayName":"QA d7daf2b213c2","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.271469930Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-643a6f7b-6c4e-4d63-a91c-0ff29f5ce5ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-643a6f7b-6c4e-4d63-a91c-0ff29f5ce5ff
Content-Type: application/json

--- request body ---
{"handle":"qa-10a5d32d500a","displayName":"QA 10a5d32d500a","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-643a6f7b-6c4e-4d63-a91c-0ff29f5ce5ff
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
Location: /v1/accounts/qa-10a5d32d500a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3328abd2-7357-4965-bc09-200b13111d20","handle":"qa-10a5d32d500a","displayName":"QA 10a5d32d500a","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.312126572Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-b828e7f0-163e-4944-a9df-57c1587950a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b828e7f0-163e-4944-a9df-57c1587950a4
Content-Type: application/json

--- request body ---
{"handle":"qa-53ca26175097","displayName":"QA 53ca26175097","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-b828e7f0-163e-4944-a9df-57c1587950a4
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
Location: /v1/accounts/qa-53ca26175097
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3694397c-0447-4a08-8095-26148f250a45","handle":"qa-53ca26175097","displayName":"QA 53ca26175097","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.364430009Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8762b0bb-5004-46ff-b63a-34baf0e0a86f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8762b0bb-5004-46ff-b63a-34baf0e0a86f
Content-Type: application/json

--- request body ---
{"handle":"qa-d7daf2b213c2","password":"****"}

--- response: 200 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-8762b0bb-5004-46ff-b63a-34baf0e0a86f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72030e7e-7092-4fc4-a327-4af8c58a1f6d"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-316fc4d2-3d7e-476d-8218-0e463206b029

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-316fc4d2-3d7e-476d-8218-0e463206b029
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-10a5d32d500a","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-316fc4d2-3d7e-476d-8218-0e463206b029
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
Location: /v1/conversations/cnv_bc0812a3-9b7d-43fb-a15a-b2670067c5f8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bc0812a3-9b7d-43fb-a15a-b2670067c5f8","subject":"Error contract","status":"open","region":"eu","participants":["qa-d7daf2b213c2","qa-10a5d32d500a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:24.449788852Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5fed4d13-9146-49ca-9c58-24a27608fbe3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fed4d13-9146-49ca-9c58-24a27608fbe3
Content-Type: application/json

--- request body ---
{"handle":"qa-53ca26175097","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fed4d13-9146-49ca-9c58-24a27608fbe3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3694397c-0447-4a08-8095-26148f250a45"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_bc0812a3-9b7d-43fb-a15a-b2670067c5f8
correlation: qa-66ef87a8-73d7-4d48-8737-53d32248a06a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66ef87a8-73d7-4d48-8737-53d32248a06a
Content-Type: application/json

--- response: 403 in 28 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66ef87a8-73d7-4d48-8737-53d32248a06a
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_bc0812a3-9b7d-43fb-a15a-b2670067c5f8","correlationId":"qa-66ef87a8-73d7-4d48-8737-53d32248a06a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cc0ff618-bec5-481c-8ed3-8c2761770f03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc0ff618-bec5-481c-8ed3-8c2761770f03
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cc0ff618-bec5-481c-8ed3-8c2761770f03
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
correlation: qa-807a9af2-92c2-48ee-8a38-6b7e1ffc6dee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-807a9af2-92c2-48ee-8a38-6b7e1ffc6dee
Content-Type: application/json

--- request body ---
{"handle":"qa-53ca26175097","password":"****"}

--- response: 401 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-807a9af2-92c2-48ee-8a38-6b7e1ffc6dee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-807a9af2-92c2-48ee-8a38-6b7e1ffc6dee"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e740d8bc-48c9-4b68-9616-f6cd6b1f208e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e740d8bc-48c9-4b68-9616-f6cd6b1f208e
Content-Type: application/json

--- request body ---
{"handle":"qa-10a5d32d500a","password":"****"}

--- response: 200 in 40 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-e740d8bc-48c9-4b68-9616-f6cd6b1f208e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3328abd2-7357-4965-bc09-200b13111d20"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-021a1902-a1e4-4a67-b451-07a658a0ef72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-021a1902-a1e4-4a67-b451-07a658a0ef72
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-021a1902-a1e4-4a67-b451-07a658a0ef72
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
correlation: qa-0d895b50-b79e-4e5e-af89-269e71931c9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d895b50-b79e-4e5e-af89-269e71931c9b
Content-Type: application/json

--- request body ---
{"handle":"qa-10a5d32d500a","password":"****"}

--- response: 401 in 48 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d895b50-b79e-4e5e-af89-269e71931c9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0d895b50-b79e-4e5e-af89-269e71931c9b"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-719957c7-8f6f-4c12-9807-f15fb333dc09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-719957c7-8f6f-4c12-9807-f15fb333dc09
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-719957c7-8f6f-4c12-9807-f15fb333dc09
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
correlation: qa-76341fc0-2153-46e0-b6d7-1a0a83e95e7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76341fc0-2153-46e0-b6d7-1a0a83e95e7e
Content-Type: application/json

--- request body ---
{"handle":"qa-d7daf2b213c2","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76341fc0-2153-46e0-b6d7-1a0a83e95e7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-76341fc0-2153-46e0-b6d7-1a0a83e95e7e"}
```
