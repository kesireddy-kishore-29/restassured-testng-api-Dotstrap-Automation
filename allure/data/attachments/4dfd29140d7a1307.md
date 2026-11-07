# Transcript: Conversation, message, page and read-state match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#conversationResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 345 | `qa-64b1406a-5011-414a-874b-182292c23e58` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-b7449bd7-7639-436e-8de5-ef6ec29bbd4e` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-e67e63ee-7db0-4d03-8d77-9ab49e2bfaac` |
| 4 | `POST /v1/conversations` | 201 | 43 | `qa-b18d4b9e-defb-4523-adb2-f8c5165906c1` |
| 5 | `GET /v1/conversations` | 200 | 22 | `qa-fd854c3f-6ba9-4817-9e99-28df5e7dac6d` |
| 6 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-bef6c28d-ca41-4009-bffe-735faf17f3d6` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 23 | `qa-1cac4970-8f37-454b-8ca2-eb6e7bb85cf7` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 12 | `qa-bbac3476-0762-4442-9523-bbef14522b1c` |
| 9 | `POST /v1/auth/token` | 200 | 16 | `qa-e00c94d9-5df1-4142-a151-8414c941569e` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 14 | `qa-6f29d27b-89fd-4c4f-b68f-c1432e20c0e0` |
| 11 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-fc270e92-52d3-4945-a187-4a157e16032f` |
| 12 | `POST /v1/auth/token` | 401 | 10 | `qa-40c2708f-8ec8-47de-ab92-67b2f5c1e8cc` |
| 13 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-cb32a537-5654-4e68-b7e4-f826a4125e59` |
| 14 | `POST /v1/auth/token` | 401 | 4 | `qa-589c4915-20f7-45b3-a20e-37964d443042` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-64b1406a-5011-414a-874b-182292c23e58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64b1406a-5011-414a-874b-182292c23e58
Content-Type: application/json

--- request body ---
{"handle":"qa-041006f7c684","displayName":"QA 041006f7c684","password":"****","region":"eu"}

--- response: 201 in 345 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-64b1406a-5011-414a-874b-182292c23e58
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
Location: /v1/accounts/qa-041006f7c684
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ad08e3e1-d893-47f6-9c68-ee90a165b027","handle":"qa-041006f7c684","displayName":"QA 041006f7c684","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.301172949Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b7449bd7-7639-436e-8de5-ef6ec29bbd4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7449bd7-7639-436e-8de5-ef6ec29bbd4e
Content-Type: application/json

--- request body ---
{"handle":"qa-68c4badebcca","displayName":"QA 68c4badebcca","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7449bd7-7639-436e-8de5-ef6ec29bbd4e
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
Location: /v1/accounts/qa-68c4badebcca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7b2f2407-f5b5-4852-9512-3f3b4b4b9163","handle":"qa-68c4badebcca","displayName":"QA 68c4badebcca","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.663461167Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e67e63ee-7db0-4d03-8d77-9ab49e2bfaac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e67e63ee-7db0-4d03-8d77-9ab49e2bfaac
Content-Type: application/json

--- request body ---
{"handle":"qa-041006f7c684","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-e67e63ee-7db0-4d03-8d77-9ab49e2bfaac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ad08e3e1-d893-47f6-9c68-ee90a165b027"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b18d4b9e-defb-4523-adb2-f8c5165906c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b18d4b9e-defb-4523-adb2-f8c5165906c1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-68c4badebcca","subject":"Contract check","message":"Hello"}

--- response: 201 in 43 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b18d4b9e-defb-4523-adb2-f8c5165906c1
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
Location: /v1/conversations/cnv_3911f3d7-2ac7-41d4-8cb3-005efe986bbf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3911f3d7-2ac7-41d4-8cb3-005efe986bbf","subject":"Contract check","status":"open","region":"eu","participants":["qa-041006f7c684","qa-68c4badebcca"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:56.764905690Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-fd854c3f-6ba9-4817-9e99-28df5e7dac6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd854c3f-6ba9-4817-9e99-28df5e7dac6d
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd854c3f-6ba9-4817-9e99-28df5e7dac6d
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
Content-Length: 259

{"items":[{"id":"cnv_3911f3d7-2ac7-41d4-8cb3-005efe986bbf","subject":"Contract check","status":"open","region":"eu","participants":["qa-041006f7c684","qa-68c4badebcca"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:56.764905690Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_3911f3d7-2ac7-41d4-8cb3-005efe986bbf
correlation: qa-bef6c28d-ca41-4009-bffe-735faf17f3d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bef6c28d-ca41-4009-bffe-735faf17f3d6
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-bef6c28d-ca41-4009-bffe-735faf17f3d6
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3911f3d7-2ac7-41d4-8cb3-005efe986bbf","subject":"Contract check","status":"open","region":"eu","participants":["qa-041006f7c684","qa-68c4badebcca"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:56.764905690Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_3911f3d7-2ac7-41d4-8cb3-005efe986bbf/messages
correlation: qa-1cac4970-8f37-454b-8ca2-eb6e7bb85cf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cac4970-8f37-454b-8ca2-eb6e7bb85cf7
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cac4970-8f37-454b-8ca2-eb6e7bb85cf7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 197

{"id":"msg_6c413efb-4a45-4441-a5be-ebcda4311413","conversationId":"cnv_3911f3d7-2ac7-41d4-8cb3-005efe986bbf","sender":"qa-041006f7c684","body":"Second","createdAt":"2026-11-07T08:54:56.889237076Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_3911f3d7-2ac7-41d4-8cb3-005efe986bbf/messages
correlation: qa-bbac3476-0762-4442-9523-bbef14522b1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbac3476-0762-4442-9523-bbef14522b1c
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbac3476-0762-4442-9523-bbef14522b1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 416

{"items":[{"id":"msg_a4c88e71-a63a-4621-9913-a1b177836e6f","conversationId":"cnv_3911f3d7-2ac7-41d4-8cb3-005efe986bbf","sender":"qa-041006f7c684","body":"Hello","createdAt":"2026-11-07T08:54:56.765063939Z"},{"id":"msg_6c413efb-4a45-4441-a5be-ebcda4311413","conversationId":"cnv_3911f3d7-2ac7-41d4-8cb3-005efe986bbf","sender":"qa-041006f7c684","body":"Second","createdAt":"2026-11-07T08:54:56.889237076Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-e00c94d9-5df1-4142-a151-8414c941569e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e00c94d9-5df1-4142-a151-8414c941569e
Content-Type: application/json

--- request body ---
{"handle":"qa-68c4badebcca","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-e00c94d9-5df1-4142-a151-8414c941569e
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7b2f2407-f5b5-4852-9512-3f3b4b4b9163"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_3911f3d7-2ac7-41d4-8cb3-005efe986bbf/read
correlation: qa-6f29d27b-89fd-4c4f-b68f-c1432e20c0e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f29d27b-89fd-4c4f-b68f-c1432e20c0e0
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f29d27b-89fd-4c4f-b68f-c1432e20c0e0
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
Content-Length: 77

{"conversationId":"cnv_3911f3d7-2ac7-41d4-8cb3-005efe986bbf","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fc270e92-52d3-4945-a187-4a157e16032f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc270e92-52d3-4945-a187-4a157e16032f
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fc270e92-52d3-4945-a187-4a157e16032f
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-40c2708f-8ec8-47de-ab92-67b2f5c1e8cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40c2708f-8ec8-47de-ab92-67b2f5c1e8cc
Content-Type: application/json

--- request body ---
{"handle":"qa-68c4badebcca","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40c2708f-8ec8-47de-ab92-67b2f5c1e8cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-40c2708f-8ec8-47de-ab92-67b2f5c1e8cc"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cb32a537-5654-4e68-b7e4-f826a4125e59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb32a537-5654-4e68-b7e4-f826a4125e59
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cb32a537-5654-4e68-b7e4-f826a4125e59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-589c4915-20f7-45b3-a20e-37964d443042

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-589c4915-20f7-45b3-a20e-37964d443042
Content-Type: application/json

--- request body ---
{"handle":"qa-041006f7c684","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-589c4915-20f7-45b3-a20e-37964d443042
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-589c4915-20f7-45b3-a20e-37964d443042"}
```
