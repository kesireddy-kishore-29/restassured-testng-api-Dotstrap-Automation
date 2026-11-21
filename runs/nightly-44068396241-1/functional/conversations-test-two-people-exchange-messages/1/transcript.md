# Transcript: Two people start a conversation and exchange messages

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#twoPeopleExchangeMessages` |
| Features | FEAT-CONV-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 385 | `qa-b66a6b10-d870-4ea8-98ac-ee8b8f1b1d11` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-090b2a94-c575-41ac-9d2b-5467470f46f2` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-5bf7e815-2285-4967-8fbe-e1b6cadfe385` |
| 4 | `POST /v1/conversations` | 201 | 106 | `qa-9397d661-a4ce-4805-bd22-57e6e6b9a3a3` |
| 5 | `POST /v1/auth/token` | 200 | 40 | `qa-a4cc955c-0b37-4bfe-a11f-e465e296935e` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 23 | `qa-b0eacd99-7714-45f3-8362-8e2394bfbc19` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 11 | `qa-a5baaea0-30e8-4e31-82b1-37a12d30165b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-0b833dba-739a-4d99-9df0-2c3707080454` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-f4d46b2b-1d44-4469-9875-e664730d0460` |
| 10 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-eae70ade-194d-42b1-b39d-a801659d2f71` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-f22ce76c-4df6-4cd9-9418-e18f60fb47c6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b66a6b10-d870-4ea8-98ac-ee8b8f1b1d11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b66a6b10-d870-4ea8-98ac-ee8b8f1b1d11
Content-Type: application/json

--- request body ---
{"handle":"qa-965a289876ce","displayName":"QA 965a289876ce","password":"****","region":"eu"}

--- response: 201 in 385 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-b66a6b10-d870-4ea8-98ac-ee8b8f1b1d11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-965a289876ce
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fa1b12b3-3059-4179-853a-9929262170bb","handle":"qa-965a289876ce","displayName":"QA 965a289876ce","region":"eu","role":"user","createdAt":"2026-11-17T10:50:21.132474144Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-090b2a94-c575-41ac-9d2b-5467470f46f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-090b2a94-c575-41ac-9d2b-5467470f46f2
Content-Type: application/json

--- request body ---
{"handle":"qa-9987bfab8add","displayName":"QA 9987bfab8add","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-090b2a94-c575-41ac-9d2b-5467470f46f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-9987bfab8add
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1d1e0c63-ede9-4c85-b868-4824a998934c","handle":"qa-9987bfab8add","displayName":"QA 9987bfab8add","region":"eu","role":"user","createdAt":"2026-11-17T10:50:21.538961952Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5bf7e815-2285-4967-8fbe-e1b6cadfe385

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bf7e815-2285-4967-8fbe-e1b6cadfe385
Content-Type: application/json

--- request body ---
{"handle":"qa-965a289876ce","password":"****"}

--- response: 200 in 35 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bf7e815-2285-4967-8fbe-e1b6cadfe385
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fa1b12b3-3059-4179-853a-9929262170bb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9397d661-a4ce-4805-bd22-57e6e6b9a3a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9397d661-a4ce-4805-bd22-57e6e6b9a3a3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9987bfab8add","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 106 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-9397d661-a4ce-4805-bd22-57e6e6b9a3a3
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
Location: /v1/conversations/cnv_5d186882-06fd-4ef2-9c51-a493ec13f65a
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_5d186882-06fd-4ef2-9c51-a493ec13f65a","subject":"Lunch?","status":"open","region":"eu","participants":["qa-965a289876ce","qa-9987bfab8add"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:21.721391495Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a4cc955c-0b37-4bfe-a11f-e465e296935e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4cc955c-0b37-4bfe-a11f-e465e296935e
Content-Type: application/json

--- request body ---
{"handle":"qa-9987bfab8add","password":"****"}

--- response: 200 in 40 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4cc955c-0b37-4bfe-a11f-e465e296935e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1d1e0c63-ede9-4c85-b868-4824a998934c"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_5d186882-06fd-4ef2-9c51-a493ec13f65a/messages
correlation: qa-b0eacd99-7714-45f3-8362-8e2394bfbc19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0eacd99-7714-45f3-8362-8e2394bfbc19
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 23 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0eacd99-7714-45f3-8362-8e2394bfbc19
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
Content-Length: 203

{"id":"msg_3dca898b-74c9-488f-ac8e-e1357b67ffbf","conversationId":"cnv_5d186882-06fd-4ef2-9c51-a493ec13f65a","sender":"qa-9987bfab8add","body":"Friday works","createdAt":"2026-11-17T10:50:21.918690888Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_5d186882-06fd-4ef2-9c51-a493ec13f65a/messages
correlation: qa-a5baaea0-30e8-4e31-82b1-37a12d30165b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5baaea0-30e8-4e31-82b1-37a12d30165b
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5baaea0-30e8-4e31-82b1-37a12d30165b
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
Content-Length: 432

{"items":[{"id":"msg_582dbf98-87e7-4705-ac35-6a2c45ee3a95","conversationId":"cnv_5d186882-06fd-4ef2-9c51-a493ec13f65a","sender":"qa-965a289876ce","body":"Free on Friday?","createdAt":"2026-11-17T10:50:21.721743134Z"},{"id":"msg_3dca898b-74c9-488f-ac8e-e1357b67ffbf","conversationId":"cnv_5d186882-06fd-4ef2-9c51-a493ec13f65a","sender":"qa-9987bfab8add","body":"Friday works","createdAt":"2026-11-17T10:50:21.918690888Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b833dba-739a-4d99-9df0-2c3707080454

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b833dba-739a-4d99-9df0-2c3707080454
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b833dba-739a-4d99-9df0-2c3707080454
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
correlation: qa-f4d46b2b-1d44-4469-9875-e664730d0460

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4d46b2b-1d44-4469-9875-e664730d0460
Content-Type: application/json

--- request body ---
{"handle":"qa-9987bfab8add","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4d46b2b-1d44-4469-9875-e664730d0460
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f4d46b2b-1d44-4469-9875-e664730d0460"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eae70ade-194d-42b1-b39d-a801659d2f71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eae70ade-194d-42b1-b39d-a801659d2f71
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eae70ade-194d-42b1-b39d-a801659d2f71
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-f22ce76c-4df6-4cd9-9418-e18f60fb47c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f22ce76c-4df6-4cd9-9418-e18f60fb47c6
Content-Type: application/json

--- request body ---
{"handle":"qa-965a289876ce","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f22ce76c-4df6-4cd9-9418-e18f60fb47c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f22ce76c-4df6-4cd9-9418-e18f60fb47c6"}
```
