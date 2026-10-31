# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 64 | `qa-d8e26c1e-53a8-4f6b-9daf-b4a5224100fa` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-53d6b6e7-b7c9-4681-a975-4921246a9df5` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-e05b7f4f-b91b-4734-9451-135ae084ef11` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-ba79e252-191d-44f8-a76e-8d8c6cbfd7d1` |
| 5 | `POST /v1/auth/token` | 503 | 23 | `qa-78e47a4e-ef38-4cff-81ea-a39684d02a3b` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-f1ee9910-2535-4da6-b861-4254560577b9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 44 | `qa-f44862c4-9c02-4fea-b091-623f7dc640bc` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-d2cae15a-87d5-4137-a05c-04e96c931689` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-794c3a11-6ab8-464a-954b-7fef906ba6a9` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-4cd6f4e7-a51c-4655-9ce1-9a3c7ae6aa1c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d8e26c1e-53a8-4f6b-9daf-b4a5224100fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8e26c1e-53a8-4f6b-9daf-b4a5224100fa
Content-Type: application/json

--- request body ---
{"handle":"qa-8d89dbb6c11e","displayName":"QA 8d89dbb6c11e","password":"****","region":"eu"}

--- response: 201 in 64 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8e26c1e-53a8-4f6b-9daf-b4a5224100fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Location: /v1/accounts/qa-8d89dbb6c11e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1a095ad7-02bf-4073-82ca-9a7fdea934b0","handle":"qa-8d89dbb6c11e","displayName":"QA 8d89dbb6c11e","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.452288424Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-53d6b6e7-b7c9-4681-a975-4921246a9df5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53d6b6e7-b7c9-4681-a975-4921246a9df5
Content-Type: application/json

--- request body ---
{"handle":"qa-1937bec0d46b","displayName":"QA 1937bec0d46b","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-53d6b6e7-b7c9-4681-a975-4921246a9df5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Location: /v1/accounts/qa-1937bec0d46b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_713a5b73-1307-4356-9038-30bb315883f6","handle":"qa-1937bec0d46b","displayName":"QA 1937bec0d46b","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.503993372Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e05b7f4f-b91b-4734-9451-135ae084ef11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e05b7f4f-b91b-4734-9451-135ae084ef11
Content-Type: application/json

--- request body ---
{"handle":"qa-8d89dbb6c11e","password":"****"}

--- response: 200 in 44 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e05b7f4f-b91b-4734-9451-135ae084ef11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1a095ad7-02bf-4073-82ca-9a7fdea934b0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ba79e252-191d-44f8-a76e-8d8c6cbfd7d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba79e252-191d-44f8-a76e-8d8c6cbfd7d1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1937bec0d46b","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba79e252-191d-44f8-a76e-8d8c6cbfd7d1
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
Location: /v1/conversations/cnv_77660419-ef82-4425-bbba-b4d8a29341e2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_77660419-ef82-4425-bbba-b4d8a29341e2","subject":"Error contract","status":"open","region":"eu","participants":["qa-8d89dbb6c11e","qa-1937bec0d46b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:32.594936560Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-78e47a4e-ef38-4cff-81ea-a39684d02a3b

--- request headers ---
Accept: application/json
X-Fault-Key: 7b06b908-07e0-4e09-b16e-189b0cf06243
X-Fault: unavailable-once
X-Correlation-Id: qa-78e47a4e-ef38-4cff-81ea-a39684d02a3b
Content-Type: application/json

--- request body ---
{"handle":"qa-8d89dbb6c11e","password":"****"}

--- response: 503 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78e47a4e-ef38-4cff-81ea-a39684d02a3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-78e47a4e-ef38-4cff-81ea-a39684d02a3b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f1ee9910-2535-4da6-b861-4254560577b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1ee9910-2535-4da6-b861-4254560577b9
Content-Type: application/json

--- request body ---
{"handle":"qa-1937bec0d46b","password":"****"}

--- response: 200 in 42 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1ee9910-2535-4da6-b861-4254560577b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_713a5b73-1307-4356-9038-30bb315883f6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f44862c4-9c02-4fea-b091-623f7dc640bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f44862c4-9c02-4fea-b091-623f7dc640bc
Content-Type: application/json

--- response: 204 in 44 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f44862c4-9c02-4fea-b091-623f7dc640bc
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
correlation: qa-d2cae15a-87d5-4137-a05c-04e96c931689

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2cae15a-87d5-4137-a05c-04e96c931689
Content-Type: application/json

--- request body ---
{"handle":"qa-1937bec0d46b","password":"****"}

--- response: 401 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2cae15a-87d5-4137-a05c-04e96c931689
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d2cae15a-87d5-4137-a05c-04e96c931689"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-794c3a11-6ab8-464a-954b-7fef906ba6a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-794c3a11-6ab8-464a-954b-7fef906ba6a9
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-794c3a11-6ab8-464a-954b-7fef906ba6a9
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-4cd6f4e7-a51c-4655-9ce1-9a3c7ae6aa1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cd6f4e7-a51c-4655-9ce1-9a3c7ae6aa1c
Content-Type: application/json

--- request body ---
{"handle":"qa-8d89dbb6c11e","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4cd6f4e7-a51c-4655-9ce1-9a3c7ae6aa1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4cd6f4e7-a51c-4655-9ce1-9a3c7ae6aa1c"}
```
