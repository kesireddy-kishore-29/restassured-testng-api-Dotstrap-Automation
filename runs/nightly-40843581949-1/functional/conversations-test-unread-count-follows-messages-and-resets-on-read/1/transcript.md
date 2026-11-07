# Transcript: Unread counts follow messages and reset when read

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#unreadCountFollowsMessagesAndResetsOnRead` |
| Features | FEAT-CONV-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-a8a5feb5-e1fb-458d-a09b-b36ce97cecf6` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-9a550759-7ff5-423a-b950-1c18690338d6` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-17432017-2291-432c-b331-1621a964065f` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-30a138d7-03dc-4bcc-bfce-2261f2c37093` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 18 | `qa-280b324b-a4f7-486f-adae-6a0f69e47a7f` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-21bd174f-cf99-4199-ac0a-3e567d506aec` |
| 7 | `GET /v1/conversations/{id}` | 200 | 17 | `qa-50c8f2d6-4986-473f-8ecd-d48098558e99` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 11 | `qa-62030b8a-7aec-4bd5-902a-485087292d51` |
| 9 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-e78438de-df5c-4096-bd8f-2dc5552a594c` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-231f2b23-b5c7-4f44-aef0-3322d7072017` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-b232a52d-9459-4c4b-a395-6af7a1db50bc` |
| 12 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-bf33ffb7-9492-43cc-83a0-ca586fe88a43` |
| 13 | `POST /v1/auth/token` | 401 | 9 | `qa-1d6c142d-cc1a-483e-8fab-9116a11d080b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a8a5feb5-e1fb-458d-a09b-b36ce97cecf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8a5feb5-e1fb-458d-a09b-b36ce97cecf6
Content-Type: application/json

--- request body ---
{"handle":"qa-0abd10629555","displayName":"QA 0abd10629555","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8a5feb5-e1fb-458d-a09b-b36ce97cecf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Location: /v1/accounts/qa-0abd10629555
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bb047e54-bacd-4c82-8b5f-cbe999c29697","handle":"qa-0abd10629555","displayName":"QA 0abd10629555","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.326405594Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9a550759-7ff5-423a-b950-1c18690338d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a550759-7ff5-423a-b950-1c18690338d6
Content-Type: application/json

--- request body ---
{"handle":"qa-b11504e3791d","displayName":"QA b11504e3791d","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a550759-7ff5-423a-b950-1c18690338d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-b11504e3791d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3720f688-250a-4839-81fb-139da60080ea","handle":"qa-b11504e3791d","displayName":"QA b11504e3791d","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.373206506Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-17432017-2291-432c-b331-1621a964065f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17432017-2291-432c-b331-1621a964065f
Content-Type: application/json

--- request body ---
{"handle":"qa-0abd10629555","password":"****"}

--- response: 200 in 13 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-17432017-2291-432c-b331-1621a964065f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bb047e54-bacd-4c82-8b5f-cbe999c29697"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-30a138d7-03dc-4bcc-bfce-2261f2c37093

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30a138d7-03dc-4bcc-bfce-2261f2c37093
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b11504e3791d","subject":"Updates","message":"First"}

--- response: 201 in 10 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-30a138d7-03dc-4bcc-bfce-2261f2c37093
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
Location: /v1/conversations/cnv_91bb2afe-4436-4bef-9bef-054378f964be
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_91bb2afe-4436-4bef-9bef-054378f964be","subject":"Updates","status":"open","region":"eu","participants":["qa-0abd10629555","qa-b11504e3791d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:58.413115595Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_91bb2afe-4436-4bef-9bef-054378f964be/messages
correlation: qa-280b324b-a4f7-486f-adae-6a0f69e47a7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-280b324b-a4f7-486f-adae-6a0f69e47a7f
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 18 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-280b324b-a4f7-486f-adae-6a0f69e47a7f
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
Content-Length: 197

{"id":"msg_253d723c-b435-4926-bb71-9b599cdef52e","conversationId":"cnv_91bb2afe-4436-4bef-9bef-054378f964be","sender":"qa-0abd10629555","body":"Second","createdAt":"2026-10-29T08:38:58.431636770Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-21bd174f-cf99-4199-ac0a-3e567d506aec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21bd174f-cf99-4199-ac0a-3e567d506aec
Content-Type: application/json

--- request body ---
{"handle":"qa-b11504e3791d","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-21bd174f-cf99-4199-ac0a-3e567d506aec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3720f688-250a-4839-81fb-139da60080ea"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_91bb2afe-4436-4bef-9bef-054378f964be
correlation: qa-50c8f2d6-4986-473f-8ecd-d48098558e99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50c8f2d6-4986-473f-8ecd-d48098558e99
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-50c8f2d6-4986-473f-8ecd-d48098558e99
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_91bb2afe-4436-4bef-9bef-054378f964be","subject":"Updates","status":"open","region":"eu","participants":["qa-0abd10629555","qa-b11504e3791d"],"messageCount":2,"unreadCount":2,"createdAt":"2026-10-29T08:38:58.413115595Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_91bb2afe-4436-4bef-9bef-054378f964be/read
correlation: qa-62030b8a-7aec-4bd5-902a-485087292d51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62030b8a-7aec-4bd5-902a-485087292d51
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-62030b8a-7aec-4bd5-902a-485087292d51
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
Content-Length: 77

{"conversationId":"cnv_91bb2afe-4436-4bef-9bef-054378f964be","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_91bb2afe-4436-4bef-9bef-054378f964be
correlation: qa-e78438de-df5c-4096-bd8f-2dc5552a594c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e78438de-df5c-4096-bd8f-2dc5552a594c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e78438de-df5c-4096-bd8f-2dc5552a594c
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
Content-Length: 230

{"id":"cnv_91bb2afe-4436-4bef-9bef-054378f964be","subject":"Updates","status":"open","region":"eu","participants":["qa-0abd10629555","qa-b11504e3791d"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-29T08:38:58.413115595Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-231f2b23-b5c7-4f44-aef0-3322d7072017

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-231f2b23-b5c7-4f44-aef0-3322d7072017
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-231f2b23-b5c7-4f44-aef0-3322d7072017
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
correlation: qa-b232a52d-9459-4c4b-a395-6af7a1db50bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b232a52d-9459-4c4b-a395-6af7a1db50bc
Content-Type: application/json

--- request body ---
{"handle":"qa-b11504e3791d","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b232a52d-9459-4c4b-a395-6af7a1db50bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b232a52d-9459-4c4b-a395-6af7a1db50bc"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bf33ffb7-9492-43cc-83a0-ca586fe88a43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf33ffb7-9492-43cc-83a0-ca586fe88a43
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bf33ffb7-9492-43cc-83a0-ca586fe88a43
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
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-1d6c142d-cc1a-483e-8fab-9116a11d080b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d6c142d-cc1a-483e-8fab-9116a11d080b
Content-Type: application/json

--- request body ---
{"handle":"qa-0abd10629555","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d6c142d-cc1a-483e-8fab-9116a11d080b
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1d6c142d-cc1a-483e-8fab-9116a11d080b"}
```
