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
| 1 | `POST /v1/accounts` | 201 | 452 | `qa-25661783-fdc6-4a01-bbe6-56c67d8e01f0` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-f3e6ed1c-8ac6-4965-a5aa-f1650cf6189f` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-598d79ab-a186-4647-837d-9d3a083d976a` |
| 4 | `POST /v1/conversations` | 201 | 67 | `qa-a40236dd-248e-46b5-9f6b-6d2aa6938958` |
| 5 | `GET /v1/conversations` | 200 | 40 | `qa-02ab4693-46e1-4bbb-a90d-44af342c0bac` |
| 6 | `GET /v1/conversations/{id}` | 200 | 23 | `qa-13f49e7b-b288-42e9-b6c4-88698584320d` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 50 | `qa-7ee88264-a463-4cda-8566-a682bde90c24` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 19 | `qa-6bcb29a0-f686-4dc0-9448-63a33bc99c82` |
| 9 | `POST /v1/auth/token` | 200 | 24 | `qa-979e2f4a-11f7-4adc-8897-d934364e49ca` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 19 | `qa-f3e6ec2a-281b-4d79-b3ed-c22e66b8edb5` |
| 11 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-923723a6-c71a-4755-bbb0-7a0cef62375c` |
| 12 | `POST /v1/auth/token` | 401 | 7 | `qa-251d553b-f8d4-45a6-ac6f-68086c1af599` |
| 13 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-26267e7d-1efe-4e7f-b534-41483497eaf6` |
| 14 | `POST /v1/auth/token` | 401 | 19 | `qa-e9bb912b-af9b-4f6f-a5c0-e7c0a72c8090` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-25661783-fdc6-4a01-bbe6-56c67d8e01f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25661783-fdc6-4a01-bbe6-56c67d8e01f0
Content-Type: application/json

--- request body ---
{"handle":"qa-a5ef4eaada9a","displayName":"QA a5ef4eaada9a","password":"****","region":"eu"}

--- response: 201 in 452 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-25661783-fdc6-4a01-bbe6-56c67d8e01f0
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
Location: /v1/accounts/qa-a5ef4eaada9a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cd5d157a-cdbd-4b63-8dd4-11adeb3cf531","handle":"qa-a5ef4eaada9a","displayName":"QA a5ef4eaada9a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:42.515124664Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f3e6ed1c-8ac6-4965-a5aa-f1650cf6189f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3e6ed1c-8ac6-4965-a5aa-f1650cf6189f
Content-Type: application/json

--- request body ---
{"handle":"qa-94ce1a2c59ac","displayName":"QA 94ce1a2c59ac","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3e6ed1c-8ac6-4965-a5aa-f1650cf6189f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-94ce1a2c59ac
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3a404320-0423-4170-abe9-4b856fa5cf27","handle":"qa-94ce1a2c59ac","displayName":"QA 94ce1a2c59ac","region":"eu","role":"user","createdAt":"2026-10-23T07:41:42.972770220Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-598d79ab-a186-4647-837d-9d3a083d976a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-598d79ab-a186-4647-837d-9d3a083d976a
Content-Type: application/json

--- request body ---
{"handle":"qa-a5ef4eaada9a","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-598d79ab-a186-4647-837d-9d3a083d976a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd5d157a-cdbd-4b63-8dd4-11adeb3cf531"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a40236dd-248e-46b5-9f6b-6d2aa6938958

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a40236dd-248e-46b5-9f6b-6d2aa6938958
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-94ce1a2c59ac","subject":"Contract check","message":"Hello"}

--- response: 201 in 67 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-a40236dd-248e-46b5-9f6b-6d2aa6938958
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
Location: /v1/conversations/cnv_2d3a4df7-4243-474e-82eb-a8f0a65eb982
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2d3a4df7-4243-474e-82eb-a8f0a65eb982","subject":"Contract check","status":"open","region":"eu","participants":["qa-a5ef4eaada9a","qa-94ce1a2c59ac"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:43.145661359Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-02ab4693-46e1-4bbb-a90d-44af342c0bac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02ab4693-46e1-4bbb-a90d-44af342c0bac
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-02ab4693-46e1-4bbb-a90d-44af342c0bac
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

{"items":[{"id":"cnv_2d3a4df7-4243-474e-82eb-a8f0a65eb982","subject":"Contract check","status":"open","region":"eu","participants":["qa-a5ef4eaada9a","qa-94ce1a2c59ac"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:43.145661359Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_2d3a4df7-4243-474e-82eb-a8f0a65eb982
correlation: qa-13f49e7b-b288-42e9-b6c4-88698584320d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13f49e7b-b288-42e9-b6c4-88698584320d
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-13f49e7b-b288-42e9-b6c4-88698584320d
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

{"id":"cnv_2d3a4df7-4243-474e-82eb-a8f0a65eb982","subject":"Contract check","status":"open","region":"eu","participants":["qa-a5ef4eaada9a","qa-94ce1a2c59ac"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:43.145661359Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_2d3a4df7-4243-474e-82eb-a8f0a65eb982/messages
correlation: qa-7ee88264-a463-4cda-8566-a682bde90c24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ee88264-a463-4cda-8566-a682bde90c24
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 50 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ee88264-a463-4cda-8566-a682bde90c24
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

{"id":"msg_d2fa1ee9-d7bf-4788-b3a4-513a27f18d05","conversationId":"cnv_2d3a4df7-4243-474e-82eb-a8f0a65eb982","sender":"qa-a5ef4eaada9a","body":"Second","createdAt":"2026-10-23T07:41:43.398928764Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_2d3a4df7-4243-474e-82eb-a8f0a65eb982/messages
correlation: qa-6bcb29a0-f686-4dc0-9448-63a33bc99c82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bcb29a0-f686-4dc0-9448-63a33bc99c82
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bcb29a0-f686-4dc0-9448-63a33bc99c82
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

{"items":[{"id":"msg_d785aa17-c811-4dbe-9588-9571e6652fc1","conversationId":"cnv_2d3a4df7-4243-474e-82eb-a8f0a65eb982","sender":"qa-a5ef4eaada9a","body":"Hello","createdAt":"2026-10-23T07:41:43.145961539Z"},{"id":"msg_d2fa1ee9-d7bf-4788-b3a4-513a27f18d05","conversationId":"cnv_2d3a4df7-4243-474e-82eb-a8f0a65eb982","sender":"qa-a5ef4eaada9a","body":"Second","createdAt":"2026-10-23T07:41:43.398928764Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-979e2f4a-11f7-4adc-8897-d934364e49ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-979e2f4a-11f7-4adc-8897-d934364e49ca
Content-Type: application/json

--- request body ---
{"handle":"qa-94ce1a2c59ac","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-979e2f4a-11f7-4adc-8897-d934364e49ca
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3a404320-0423-4170-abe9-4b856fa5cf27"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_2d3a4df7-4243-474e-82eb-a8f0a65eb982/read
correlation: qa-f3e6ec2a-281b-4d79-b3ed-c22e66b8edb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3e6ec2a-281b-4d79-b3ed-c22e66b8edb5
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3e6ec2a-281b-4d79-b3ed-c22e66b8edb5
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

{"conversationId":"cnv_2d3a4df7-4243-474e-82eb-a8f0a65eb982","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-923723a6-c71a-4755-bbb0-7a0cef62375c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-923723a6-c71a-4755-bbb0-7a0cef62375c
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-923723a6-c71a-4755-bbb0-7a0cef62375c
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
correlation: qa-251d553b-f8d4-45a6-ac6f-68086c1af599

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-251d553b-f8d4-45a6-ac6f-68086c1af599
Content-Type: application/json

--- request body ---
{"handle":"qa-94ce1a2c59ac","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-251d553b-f8d4-45a6-ac6f-68086c1af599
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-251d553b-f8d4-45a6-ac6f-68086c1af599"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-26267e7d-1efe-4e7f-b534-41483497eaf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26267e7d-1efe-4e7f-b534-41483497eaf6
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-26267e7d-1efe-4e7f-b534-41483497eaf6
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
correlation: qa-e9bb912b-af9b-4f6f-a5c0-e7c0a72c8090

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9bb912b-af9b-4f6f-a5c0-e7c0a72c8090
Content-Type: application/json

--- request body ---
{"handle":"qa-a5ef4eaada9a","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9bb912b-af9b-4f6f-a5c0-e7c0a72c8090
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e9bb912b-af9b-4f6f-a5c0-e7c0a72c8090"}
```
