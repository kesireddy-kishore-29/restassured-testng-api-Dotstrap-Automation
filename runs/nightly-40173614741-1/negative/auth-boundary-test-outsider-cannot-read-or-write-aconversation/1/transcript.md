# Transcript: Someone outside a conversation gets 403, not its content

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#outsiderCannotReadOrWriteAConversation` |
| Features | FEAT-AUTHZ-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-ea5cf38c-e738-4ba8-a4fb-d3724ca0ab2e` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-f2e1a9dd-9ea8-471a-a783-517443a3c03b` |
| 3 | `POST /v1/accounts` | 201 | 21 | `qa-54675b13-0ed8-4732-8432-fda98fe62747` |
| 4 | `POST /v1/auth/token` | 200 | 24 | `qa-d9c87b66-38f0-4a8c-ae37-4ffe175dfba5` |
| 5 | `POST /v1/conversations` | 201 | 12 | `qa-85091f5c-9733-4958-bde5-f69214e39fe5` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-6ebf30e6-1796-4c2f-977b-c29aeffee945` |
| 7 | `GET /v1/conversations/{id}` | 403 | 21 | `qa-52b2bed2-6c17-4c4f-81c1-b9d22c246dc7` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 9 | `qa-631eaf6a-0ff0-4fa2-ad34-250259e3af79` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 10 | `qa-0211874c-b00e-4a40-9c9b-c1610e5008b9` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-66540509-a58a-4163-b61c-78a1402d4299` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-3f06fb8b-db6b-4b11-94bd-f3000254826a` |
| 12 | `POST /v1/auth/token` | 200 | 10 | `qa-16d437e4-22d6-491f-986b-cee680ac5e79` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-388822b2-1e24-45d2-ab3f-6f65cfef252b` |
| 14 | `POST /v1/auth/token` | 401 | 6 | `qa-ba61d8ee-311d-429a-8777-cad9d2e5d8cf` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-55fa6e6f-f0e6-403f-bd93-b7112a11020d` |
| 16 | `POST /v1/auth/token` | 401 | 8 | `qa-45caa82c-17ff-4986-bc39-87858411379b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ea5cf38c-e738-4ba8-a4fb-d3724ca0ab2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea5cf38c-e738-4ba8-a4fb-d3724ca0ab2e
Content-Type: application/json

--- request body ---
{"handle":"qa-a455dd652e94","displayName":"QA a455dd652e94","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea5cf38c-e738-4ba8-a4fb-d3724ca0ab2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-a455dd652e94
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d997593-1730-4459-9951-b4401607660e","handle":"qa-a455dd652e94","displayName":"QA a455dd652e94","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.186503067Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f2e1a9dd-9ea8-471a-a783-517443a3c03b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2e1a9dd-9ea8-471a-a783-517443a3c03b
Content-Type: application/json

--- request body ---
{"handle":"qa-08870ef5d866","displayName":"QA 08870ef5d866","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2e1a9dd-9ea8-471a-a783-517443a3c03b
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
Location: /v1/accounts/qa-08870ef5d866
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3d5ced74-0305-4406-bfd3-23b4b36fae6e","handle":"qa-08870ef5d866","displayName":"QA 08870ef5d866","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.213781987Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-54675b13-0ed8-4732-8432-fda98fe62747

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54675b13-0ed8-4732-8432-fda98fe62747
Content-Type: application/json

--- request body ---
{"handle":"qa-5a0ce54bb674","displayName":"QA 5a0ce54bb674","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-54675b13-0ed8-4732-8432-fda98fe62747
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 8
Location: /v1/accounts/qa-5a0ce54bb674
X-Served-Region: eu
Content-Length: 181

{"id":"acc_08431912-2ae2-4269-97da-0093742e0f9b","handle":"qa-5a0ce54bb674","displayName":"QA 5a0ce54bb674","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.246109531Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d9c87b66-38f0-4a8c-ae37-4ffe175dfba5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9c87b66-38f0-4a8c-ae37-4ffe175dfba5
Content-Type: application/json

--- request body ---
{"handle":"qa-a455dd652e94","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9c87b66-38f0-4a8c-ae37-4ffe175dfba5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d997593-1730-4459-9951-b4401607660e"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-85091f5c-9733-4958-bde5-f69214e39fe5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85091f5c-9733-4958-bde5-f69214e39fe5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-08870ef5d866","subject":"Private","message":"Just us"}

--- response: 201 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-85091f5c-9733-4958-bde5-f69214e39fe5
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
Location: /v1/conversations/cnv_1eae164b-c1d4-4237-93cc-998ffdbab3d4
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_1eae164b-c1d4-4237-93cc-998ffdbab3d4","subject":"Private","status":"open","region":"eu","participants":["qa-a455dd652e94","qa-08870ef5d866"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.306044324Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6ebf30e6-1796-4c2f-977b-c29aeffee945

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ebf30e6-1796-4c2f-977b-c29aeffee945
Content-Type: application/json

--- request body ---
{"handle":"qa-5a0ce54bb674","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ebf30e6-1796-4c2f-977b-c29aeffee945
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_08431912-2ae2-4269-97da-0093742e0f9b"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_1eae164b-c1d4-4237-93cc-998ffdbab3d4
correlation: qa-52b2bed2-6c17-4c4f-81c1-b9d22c246dc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52b2bed2-6c17-4c4f-81c1-b9d22c246dc7
Content-Type: application/json

--- response: 403 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52b2bed2-6c17-4c4f-81c1-b9d22c246dc7
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_1eae164b-c1d4-4237-93cc-998ffdbab3d4","correlationId":"qa-52b2bed2-6c17-4c4f-81c1-b9d22c246dc7"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_1eae164b-c1d4-4237-93cc-998ffdbab3d4/messages
correlation: qa-631eaf6a-0ff0-4fa2-ad34-250259e3af79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-631eaf6a-0ff0-4fa2-ad34-250259e3af79
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-631eaf6a-0ff0-4fa2-ad34-250259e3af79
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_1eae164b-c1d4-4237-93cc-998ffdbab3d4/messages","correlationId":"qa-631eaf6a-0ff0-4fa2-ad34-250259e3af79"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_1eae164b-c1d4-4237-93cc-998ffdbab3d4/messages
correlation: qa-0211874c-b00e-4a40-9c9b-c1610e5008b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0211874c-b00e-4a40-9c9b-c1610e5008b9
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0211874c-b00e-4a40-9c9b-c1610e5008b9
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_1eae164b-c1d4-4237-93cc-998ffdbab3d4/messages","correlationId":"qa-0211874c-b00e-4a40-9c9b-c1610e5008b9"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-66540509-a58a-4163-b61c-78a1402d4299

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66540509-a58a-4163-b61c-78a1402d4299
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-66540509-a58a-4163-b61c-78a1402d4299
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-3f06fb8b-db6b-4b11-94bd-f3000254826a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f06fb8b-db6b-4b11-94bd-f3000254826a
Content-Type: application/json

--- request body ---
{"handle":"qa-5a0ce54bb674","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f06fb8b-db6b-4b11-94bd-f3000254826a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3f06fb8b-db6b-4b11-94bd-f3000254826a"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-16d437e4-22d6-491f-986b-cee680ac5e79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16d437e4-22d6-491f-986b-cee680ac5e79
Content-Type: application/json

--- request body ---
{"handle":"qa-08870ef5d866","password":"****"}

--- response: 200 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-16d437e4-22d6-491f-986b-cee680ac5e79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3d5ced74-0305-4406-bfd3-23b4b36fae6e"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-388822b2-1e24-45d2-ab3f-6f65cfef252b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-388822b2-1e24-45d2-ab3f-6f65cfef252b
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-388822b2-1e24-45d2-ab3f-6f65cfef252b
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-ba61d8ee-311d-429a-8777-cad9d2e5d8cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba61d8ee-311d-429a-8777-cad9d2e5d8cf
Content-Type: application/json

--- request body ---
{"handle":"qa-08870ef5d866","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba61d8ee-311d-429a-8777-cad9d2e5d8cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ba61d8ee-311d-429a-8777-cad9d2e5d8cf"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-55fa6e6f-f0e6-403f-bd93-b7112a11020d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55fa6e6f-f0e6-403f-bd93-b7112a11020d
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-55fa6e6f-f0e6-403f-bd93-b7112a11020d
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

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-45caa82c-17ff-4986-bc39-87858411379b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45caa82c-17ff-4986-bc39-87858411379b
Content-Type: application/json

--- request body ---
{"handle":"qa-a455dd652e94","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-45caa82c-17ff-4986-bc39-87858411379b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-45caa82c-17ff-4986-bc39-87858411379b"}
```
