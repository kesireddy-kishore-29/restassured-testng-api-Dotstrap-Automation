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
| 1 | `POST /v1/accounts` | 201 | 473 | `qa-554cbd85-c553-4393-abb3-571245ec9d58` |
| 2 | `POST /v1/accounts` | 201 | 85 | `qa-ec74f274-065f-48d9-8a9f-4573c2e587a1` |
| 3 | `POST /v1/accounts` | 201 | 63 | `qa-d03a3713-767c-4cb5-b605-a423021d7148` |
| 4 | `POST /v1/auth/token` | 200 | 40 | `qa-b86822c0-a4b5-44a9-bf8f-bdede88b68cf` |
| 5 | `POST /v1/conversations` | 201 | 91 | `qa-5cfdb708-0129-40b8-a5e0-7b49adbedb9e` |
| 6 | `POST /v1/auth/token` | 200 | 46 | `qa-d4f2002d-4d05-4d0b-b782-66b2f04592af` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 39 | `qa-42261591-f43b-4285-b797-5f9a7197f284` |
| 8 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-4053a950-ae00-487f-8e78-bb06d2e2dc11` |
| 9 | `POST /v1/auth/token` | 401 | 20 | `qa-37a6f0d8-7bcf-42fd-9495-315deda8be52` |
| 10 | `POST /v1/auth/token` | 200 | 40 | `qa-189d0477-46f6-4ba5-afd4-6ad810102ff7` |
| 11 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-fe38d078-e945-49ea-a1dd-df6826f17157` |
| 12 | `POST /v1/auth/token` | 401 | 37 | `qa-fc132c73-dc6b-4460-bcbd-618abb969f70` |
| 13 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-7ec8bb2d-1981-48c7-85a0-8d1d2ba3c2e1` |
| 14 | `POST /v1/auth/token` | 401 | 27 | `qa-355e012e-2cc8-4c71-88e4-d5d21d2d2999` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-554cbd85-c553-4393-abb3-571245ec9d58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-554cbd85-c553-4393-abb3-571245ec9d58
Content-Type: application/json

--- request body ---
{"handle":"qa-ee6a1a88093a","displayName":"QA ee6a1a88093a","password":"****","region":"eu"}

--- response: 201 in 473 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-554cbd85-c553-4393-abb3-571245ec9d58
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
Location: /v1/accounts/qa-ee6a1a88093a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0c688d94-e751-4648-b982-2aba221c37e7","handle":"qa-ee6a1a88093a","displayName":"QA ee6a1a88093a","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.627936318Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ec74f274-065f-48d9-8a9f-4573c2e587a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec74f274-065f-48d9-8a9f-4573c2e587a1
Content-Type: application/json

--- request body ---
{"handle":"qa-4a4362e94f22","displayName":"QA 4a4362e94f22","password":"****","region":"eu"}

--- response: 201 in 85 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec74f274-065f-48d9-8a9f-4573c2e587a1
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
Location: /v1/accounts/qa-4a4362e94f22
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1418a1c8-ae52-44d4-b32d-582da59b9c0f","handle":"qa-4a4362e94f22","displayName":"QA 4a4362e94f22","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.149476071Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-d03a3713-767c-4cb5-b605-a423021d7148

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d03a3713-767c-4cb5-b605-a423021d7148
Content-Type: application/json

--- request body ---
{"handle":"qa-25bbede072ed","displayName":"QA 25bbede072ed","password":"****","region":"eu"}

--- response: 201 in 63 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d03a3713-767c-4cb5-b605-a423021d7148
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
Location: /v1/accounts/qa-25bbede072ed
X-Served-Region: eu
Content-Length: 181

{"id":"acc_93144ddd-aaae-4153-a0d7-84cac18f4e85","handle":"qa-25bbede072ed","displayName":"QA 25bbede072ed","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.254489692Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-b86822c0-a4b5-44a9-bf8f-bdede88b68cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b86822c0-a4b5-44a9-bf8f-bdede88b68cf
Content-Type: application/json

--- request body ---
{"handle":"qa-ee6a1a88093a","password":"****"}

--- response: 200 in 40 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-b86822c0-a4b5-44a9-bf8f-bdede88b68cf
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0c688d94-e751-4648-b982-2aba221c37e7"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-5cfdb708-0129-40b8-a5e0-7b49adbedb9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cfdb708-0129-40b8-a5e0-7b49adbedb9e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4a4362e94f22","subject":"Error contract","message":"Hi"}

--- response: 201 in 91 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-5cfdb708-0129-40b8-a5e0-7b49adbedb9e
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
Location: /v1/conversations/cnv_f406f496-aba2-421e-8020-375c4b4d6b88
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f406f496-aba2-421e-8020-375c4b4d6b88","subject":"Error contract","status":"open","region":"eu","participants":["qa-ee6a1a88093a","qa-4a4362e94f22"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:58.469740272Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d4f2002d-4d05-4d0b-b782-66b2f04592af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4f2002d-4d05-4d0b-b782-66b2f04592af
Content-Type: application/json

--- request body ---
{"handle":"qa-25bbede072ed","password":"****"}

--- response: 200 in 46 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4f2002d-4d05-4d0b-b782-66b2f04592af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_93144ddd-aaae-4153-a0d7-84cac18f4e85"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_f406f496-aba2-421e-8020-375c4b4d6b88/messages
correlation: qa-42261591-f43b-4285-b797-5f9a7197f284

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42261591-f43b-4285-b797-5f9a7197f284
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 39 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42261591-f43b-4285-b797-5f9a7197f284
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f406f496-aba2-421e-8020-375c4b4d6b88/messages","correlationId":"qa-42261591-f43b-4285-b797-5f9a7197f284"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4053a950-ae00-487f-8e78-bb06d2e2dc11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4053a950-ae00-487f-8e78-bb06d2e2dc11
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4053a950-ae00-487f-8e78-bb06d2e2dc11
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
correlation: qa-37a6f0d8-7bcf-42fd-9495-315deda8be52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37a6f0d8-7bcf-42fd-9495-315deda8be52
Content-Type: application/json

--- request body ---
{"handle":"qa-25bbede072ed","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37a6f0d8-7bcf-42fd-9495-315deda8be52
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-37a6f0d8-7bcf-42fd-9495-315deda8be52"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-189d0477-46f6-4ba5-afd4-6ad810102ff7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-189d0477-46f6-4ba5-afd4-6ad810102ff7
Content-Type: application/json

--- request body ---
{"handle":"qa-4a4362e94f22","password":"****"}

--- response: 200 in 40 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-189d0477-46f6-4ba5-afd4-6ad810102ff7
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1418a1c8-ae52-44d4-b32d-582da59b9c0f"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fe38d078-e945-49ea-a1dd-df6826f17157

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe38d078-e945-49ea-a1dd-df6826f17157
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fe38d078-e945-49ea-a1dd-df6826f17157
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
correlation: qa-fc132c73-dc6b-4460-bcbd-618abb969f70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc132c73-dc6b-4460-bcbd-618abb969f70
Content-Type: application/json

--- request body ---
{"handle":"qa-4a4362e94f22","password":"****"}

--- response: 401 in 37 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc132c73-dc6b-4460-bcbd-618abb969f70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fc132c73-dc6b-4460-bcbd-618abb969f70"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7ec8bb2d-1981-48c7-85a0-8d1d2ba3c2e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ec8bb2d-1981-48c7-85a0-8d1d2ba3c2e1
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7ec8bb2d-1981-48c7-85a0-8d1d2ba3c2e1
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
correlation: qa-355e012e-2cc8-4c71-88e4-d5d21d2d2999

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-355e012e-2cc8-4c71-88e4-d5d21d2d2999
Content-Type: application/json

--- request body ---
{"handle":"qa-ee6a1a88093a","password":"****"}

--- response: 401 in 27 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-355e012e-2cc8-4c71-88e4-d5d21d2d2999
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-355e012e-2cc8-4c71-88e4-d5d21d2d2999"}
```
