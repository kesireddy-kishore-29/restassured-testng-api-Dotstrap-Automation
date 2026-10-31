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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-017654ac-99e3-4c84-a833-33290de29a3f` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-91887264-0fa2-4d4f-b490-3c662b733a87` |
| 3 | `POST /v1/accounts` | 201 | 32 | `qa-633d506e-c5ae-40c9-96c2-d6b54b4d7952` |
| 4 | `POST /v1/auth/token` | 200 | 53 | `qa-2829aaa7-cc5e-483e-a379-11a1fd19b6e0` |
| 5 | `POST /v1/conversations` | 201 | 8 | `qa-b9047bf1-dcc9-4790-b4d9-34a9f11d093d` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-80be03f2-334c-4160-b933-55a23392c015` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 22 | `qa-57ea8b47-5e0b-4ce1-8504-3f100f51592e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-dc20abdd-1168-4a08-b2d0-8cfa516f20fe` |
| 9 | `POST /v1/auth/token` | 401 | 23 | `qa-dda28e9c-ee68-4ad8-98e7-4568255f5027` |
| 10 | `POST /v1/auth/token` | 200 | 45 | `qa-24607b2d-d707-46cc-8cb9-1eb66f10b778` |
| 11 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-b6b62a06-acc2-4411-8d9d-951bfa3ff3d6` |
| 12 | `POST /v1/auth/token` | 401 | 33 | `qa-73ada091-097c-4fd2-9cb4-da215794deea` |
| 13 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-f5193228-6e8b-4eb7-9f5e-3fe8e8c079b3` |
| 14 | `POST /v1/auth/token` | 401 | 39 | `qa-42e619bc-6cd8-4ac2-a4da-533fd330747a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-017654ac-99e3-4c84-a833-33290de29a3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-017654ac-99e3-4c84-a833-33290de29a3f
Content-Type: application/json

--- request body ---
{"handle":"qa-25606ba2267d","displayName":"QA 25606ba2267d","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-017654ac-99e3-4c84-a833-33290de29a3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Location: /v1/accounts/qa-25606ba2267d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cb89657-e0f2-4ace-b232-a55f89c11bd1","handle":"qa-25606ba2267d","displayName":"QA 25606ba2267d","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.269410732Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-91887264-0fa2-4d4f-b490-3c662b733a87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91887264-0fa2-4d4f-b490-3c662b733a87
Content-Type: application/json

--- request body ---
{"handle":"qa-853def8a7101","displayName":"QA 853def8a7101","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-91887264-0fa2-4d4f-b490-3c662b733a87
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
Location: /v1/accounts/qa-853def8a7101
X-Served-Region: eu
Content-Length: 181

{"id":"acc_96e2f876-79e7-4a67-bf90-adfe8e49d531","handle":"qa-853def8a7101","displayName":"QA 853def8a7101","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.297011868Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-633d506e-c5ae-40c9-96c2-d6b54b4d7952

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-633d506e-c5ae-40c9-96c2-d6b54b4d7952
Content-Type: application/json

--- request body ---
{"handle":"qa-3162d6c7d4e6","displayName":"QA 3162d6c7d4e6","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-633d506e-c5ae-40c9-96c2-d6b54b4d7952
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Location: /v1/accounts/qa-3162d6c7d4e6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eeb443f6-1131-46c9-80a4-aac98a3cd178","handle":"qa-3162d6c7d4e6","displayName":"QA 3162d6c7d4e6","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.336987996Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-2829aaa7-cc5e-483e-a379-11a1fd19b6e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2829aaa7-cc5e-483e-a379-11a1fd19b6e0
Content-Type: application/json

--- request body ---
{"handle":"qa-25606ba2267d","password":"****"}

--- response: 200 in 53 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-2829aaa7-cc5e-483e-a379-11a1fd19b6e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4cb89657-e0f2-4ace-b232-a55f89c11bd1"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-b9047bf1-dcc9-4790-b4d9-34a9f11d093d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9047bf1-dcc9-4790-b4d9-34a9f11d093d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-853def8a7101","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9047bf1-dcc9-4790-b4d9-34a9f11d093d
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
Location: /v1/conversations/cnv_632958bb-9356-474c-8b69-8b62a9e15836
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_632958bb-9356-474c-8b69-8b62a9e15836","subject":"Error contract","status":"open","region":"eu","participants":["qa-25606ba2267d","qa-853def8a7101"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:24.449923663Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-80be03f2-334c-4160-b933-55a23392c015

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80be03f2-334c-4160-b933-55a23392c015
Content-Type: application/json

--- request body ---
{"handle":"qa-3162d6c7d4e6","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-80be03f2-334c-4160-b933-55a23392c015
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eeb443f6-1131-46c9-80a4-aac98a3cd178"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_632958bb-9356-474c-8b69-8b62a9e15836/messages
correlation: qa-57ea8b47-5e0b-4ce1-8504-3f100f51592e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57ea8b47-5e0b-4ce1-8504-3f100f51592e
Content-Type: application/json

--- response: 403 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57ea8b47-5e0b-4ce1-8504-3f100f51592e
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_632958bb-9356-474c-8b69-8b62a9e15836/messages","correlationId":"qa-57ea8b47-5e0b-4ce1-8504-3f100f51592e"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dc20abdd-1168-4a08-b2d0-8cfa516f20fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc20abdd-1168-4a08-b2d0-8cfa516f20fe
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dc20abdd-1168-4a08-b2d0-8cfa516f20fe
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
correlation: qa-dda28e9c-ee68-4ad8-98e7-4568255f5027

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dda28e9c-ee68-4ad8-98e7-4568255f5027
Content-Type: application/json

--- request body ---
{"handle":"qa-3162d6c7d4e6","password":"****"}

--- response: 401 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dda28e9c-ee68-4ad8-98e7-4568255f5027
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dda28e9c-ee68-4ad8-98e7-4568255f5027"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-24607b2d-d707-46cc-8cb9-1eb66f10b778

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24607b2d-d707-46cc-8cb9-1eb66f10b778
Content-Type: application/json

--- request body ---
{"handle":"qa-853def8a7101","password":"****"}

--- response: 200 in 45 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-24607b2d-d707-46cc-8cb9-1eb66f10b778
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_96e2f876-79e7-4a67-bf90-adfe8e49d531"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b6b62a06-acc2-4411-8d9d-951bfa3ff3d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6b62a06-acc2-4411-8d9d-951bfa3ff3d6
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b6b62a06-acc2-4411-8d9d-951bfa3ff3d6
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
correlation: qa-73ada091-097c-4fd2-9cb4-da215794deea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73ada091-097c-4fd2-9cb4-da215794deea
Content-Type: application/json

--- request body ---
{"handle":"qa-853def8a7101","password":"****"}

--- response: 401 in 33 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73ada091-097c-4fd2-9cb4-da215794deea
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-73ada091-097c-4fd2-9cb4-da215794deea"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f5193228-6e8b-4eb7-9f5e-3fe8e8c079b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5193228-6e8b-4eb7-9f5e-3fe8e8c079b3
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f5193228-6e8b-4eb7-9f5e-3fe8e8c079b3
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
correlation: qa-42e619bc-6cd8-4ac2-a4da-533fd330747a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42e619bc-6cd8-4ac2-a4da-533fd330747a
Content-Type: application/json

--- request body ---
{"handle":"qa-25606ba2267d","password":"****"}

--- response: 401 in 39 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42e619bc-6cd8-4ac2-a4da-533fd330747a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-42e619bc-6cd8-4ac2-a4da-533fd330747a"}
```
