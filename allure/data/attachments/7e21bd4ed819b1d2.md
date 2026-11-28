# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-1ed39e23-74b9-465a-a08d-e3e14a1c6cc2` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-2c4d12a7-52ed-4ca0-9e4b-5dba78f71142` |
| 3 | `POST /v1/accounts` | 201 | 34 | `qa-d6bd9c0e-5f44-4e80-b192-086472f08cbf` |
| 4 | `POST /v1/auth/token` | 200 | 46 | `qa-8c86b2fb-3d7a-4889-99a6-c9c5adcb8aac` |
| 5 | `POST /v1/conversations` | 201 | 17 | `qa-d60f7d68-4a50-4ae9-a64d-363c3d44e300` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-6a6d55aa-3f00-47c6-801c-ea922ba8aed5` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 15 | `qa-3e4756e8-b30b-41af-90a2-1ec85e29b1cf` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-6403f2d0-dd84-4a84-a796-544ad74f6727` |
| 9 | `POST /v1/auth/token` | 401 | 17 | `qa-c177d72d-4057-4e10-9f91-218f21466bac` |
| 10 | `POST /v1/auth/token` | 200 | 32 | `qa-d6124b33-df06-4695-b22b-29b9fd46ce38` |
| 11 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-281e0244-c189-4e8d-adb3-24a81235ebe9` |
| 12 | `POST /v1/auth/token` | 401 | 36 | `qa-f51d6258-bdf0-4b5f-847c-98148fbdb2bc` |
| 13 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-84945c5a-ae4c-48bf-ac6d-fc5615036504` |
| 14 | `POST /v1/auth/token` | 401 | 11 | `qa-be65fb4d-40a4-496d-b619-b141fcd7f6ed` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1ed39e23-74b9-465a-a08d-e3e14a1c6cc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ed39e23-74b9-465a-a08d-e3e14a1c6cc2
Content-Type: application/json

--- request body ---
{"handle":"qa-266241e56be7","displayName":"QA 266241e56be7","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ed39e23-74b9-465a-a08d-e3e14a1c6cc2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Location: /v1/accounts/qa-266241e56be7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7fa3f54c-8465-4949-86ab-8f2fce558620","handle":"qa-266241e56be7","displayName":"QA 266241e56be7","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.313030091Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2c4d12a7-52ed-4ca0-9e4b-5dba78f71142

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c4d12a7-52ed-4ca0-9e4b-5dba78f71142
Content-Type: application/json

--- request body ---
{"handle":"qa-aaf02312f127","displayName":"QA aaf02312f127","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c4d12a7-52ed-4ca0-9e4b-5dba78f71142
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Location: /v1/accounts/qa-aaf02312f127
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a671287e-6e1c-42c0-b802-76fd982929b5","handle":"qa-aaf02312f127","displayName":"QA aaf02312f127","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.382985667Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-d6bd9c0e-5f44-4e80-b192-086472f08cbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6bd9c0e-5f44-4e80-b192-086472f08cbf
Content-Type: application/json

--- request body ---
{"handle":"qa-fe9562319f41","displayName":"QA fe9562319f41","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6bd9c0e-5f44-4e80-b192-086472f08cbf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 7
Location: /v1/accounts/qa-fe9562319f41
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8a4e863d-086d-4850-9a5f-f066ec8b067a","handle":"qa-fe9562319f41","displayName":"QA fe9562319f41","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.429547812Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8c86b2fb-3d7a-4889-99a6-c9c5adcb8aac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c86b2fb-3d7a-4889-99a6-c9c5adcb8aac
Content-Type: application/json

--- request body ---
{"handle":"qa-266241e56be7","password":"****"}

--- response: 200 in 46 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c86b2fb-3d7a-4889-99a6-c9c5adcb8aac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7fa3f54c-8465-4949-86ab-8f2fce558620"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d60f7d68-4a50-4ae9-a64d-363c3d44e300

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d60f7d68-4a50-4ae9-a64d-363c3d44e300
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-aaf02312f127","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-d60f7d68-4a50-4ae9-a64d-363c3d44e300
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
Location: /v1/conversations/cnv_3c903634-a224-4a60-bd40-c66183760a4a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3c903634-a224-4a60-bd40-c66183760a4a","subject":"Error contract","status":"open","region":"eu","participants":["qa-266241e56be7","qa-aaf02312f127"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:24.520608155Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6a6d55aa-3f00-47c6-801c-ea922ba8aed5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a6d55aa-3f00-47c6-801c-ea922ba8aed5
Content-Type: application/json

--- request body ---
{"handle":"qa-fe9562319f41","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a6d55aa-3f00-47c6-801c-ea922ba8aed5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8a4e863d-086d-4850-9a5f-f066ec8b067a"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_3c903634-a224-4a60-bd40-c66183760a4a/close
correlation: qa-3e4756e8-b30b-41af-90a2-1ec85e29b1cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e4756e8-b30b-41af-90a2-1ec85e29b1cf
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e4756e8-b30b-41af-90a2-1ec85e29b1cf
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_3c903634-a224-4a60-bd40-c66183760a4a/close","correlationId":"qa-3e4756e8-b30b-41af-90a2-1ec85e29b1cf"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6403f2d0-dd84-4a84-a796-544ad74f6727

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6403f2d0-dd84-4a84-a796-544ad74f6727
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6403f2d0-dd84-4a84-a796-544ad74f6727
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
correlation: qa-c177d72d-4057-4e10-9f91-218f21466bac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c177d72d-4057-4e10-9f91-218f21466bac
Content-Type: application/json

--- request body ---
{"handle":"qa-fe9562319f41","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c177d72d-4057-4e10-9f91-218f21466bac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c177d72d-4057-4e10-9f91-218f21466bac"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d6124b33-df06-4695-b22b-29b9fd46ce38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6124b33-df06-4695-b22b-29b9fd46ce38
Content-Type: application/json

--- request body ---
{"handle":"qa-aaf02312f127","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6124b33-df06-4695-b22b-29b9fd46ce38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a671287e-6e1c-42c0-b802-76fd982929b5"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-281e0244-c189-4e8d-adb3-24a81235ebe9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-281e0244-c189-4e8d-adb3-24a81235ebe9
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-281e0244-c189-4e8d-adb3-24a81235ebe9
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
correlation: qa-f51d6258-bdf0-4b5f-847c-98148fbdb2bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f51d6258-bdf0-4b5f-847c-98148fbdb2bc
Content-Type: application/json

--- request body ---
{"handle":"qa-aaf02312f127","password":"****"}

--- response: 401 in 36 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f51d6258-bdf0-4b5f-847c-98148fbdb2bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f51d6258-bdf0-4b5f-847c-98148fbdb2bc"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-84945c5a-ae4c-48bf-ac6d-fc5615036504

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84945c5a-ae4c-48bf-ac6d-fc5615036504
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-84945c5a-ae4c-48bf-ac6d-fc5615036504
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
correlation: qa-be65fb4d-40a4-496d-b619-b141fcd7f6ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be65fb4d-40a4-496d-b619-b141fcd7f6ed
Content-Type: application/json

--- request body ---
{"handle":"qa-266241e56be7","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be65fb4d-40a4-496d-b619-b141fcd7f6ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-be65fb4d-40a4-496d-b619-b141fcd7f6ed"}
```
