# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-8cc7e98c-4464-47e9-8eba-14372324024b` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-c20f43eb-c723-4d64-80e7-8fee462e7b53` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-b8c122f0-7506-4144-8a2e-6434039219ee` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-0e9e8b07-7bdf-477f-84e7-da3517541b72` |
| 5 | `POST /v1/auth/token` | 415 | 55 | `qa-e093b800-c108-4c16-ac42-185674ea7182` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-592a43de-aaeb-4cbd-aac4-11461d244795` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-c1727c5e-e8cf-45db-a451-4af08da130c0` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-893ea89a-a56f-4302-9550-b92553f0f9d7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-00e610be-e87e-4e36-9d4b-513571d63576` |
| 10 | `POST /v1/auth/token` | 401 | 44 | `qa-d4cebe13-d9b9-4de8-9af0-41cf3f24d45d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8cc7e98c-4464-47e9-8eba-14372324024b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cc7e98c-4464-47e9-8eba-14372324024b
Content-Type: application/json

--- request body ---
{"handle":"qa-06b17c7f0b0a","displayName":"QA 06b17c7f0b0a","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cc7e98c-4464-47e9-8eba-14372324024b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Location: /v1/accounts/qa-06b17c7f0b0a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_42011def-753f-4376-9cd9-5384f65082bc","handle":"qa-06b17c7f0b0a","displayName":"QA 06b17c7f0b0a","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.848736153Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c20f43eb-c723-4d64-80e7-8fee462e7b53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c20f43eb-c723-4d64-80e7-8fee462e7b53
Content-Type: application/json

--- request body ---
{"handle":"qa-16a35df2614a","displayName":"QA 16a35df2614a","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c20f43eb-c723-4d64-80e7-8fee462e7b53
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
Location: /v1/accounts/qa-16a35df2614a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3b25c94e-5876-49e0-a43c-21beec13aa7b","handle":"qa-16a35df2614a","displayName":"QA 16a35df2614a","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.887164859Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b8c122f0-7506-4144-8a2e-6434039219ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8c122f0-7506-4144-8a2e-6434039219ee
Content-Type: application/json

--- request body ---
{"handle":"qa-06b17c7f0b0a","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8c122f0-7506-4144-8a2e-6434039219ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_42011def-753f-4376-9cd9-5384f65082bc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0e9e8b07-7bdf-477f-84e7-da3517541b72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e9e8b07-7bdf-477f-84e7-da3517541b72
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-16a35df2614a","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e9e8b07-7bdf-477f-84e7-da3517541b72
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
Location: /v1/conversations/cnv_5a95fa8e-7845-453e-9f3b-df2bcf129b69
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5a95fa8e-7845-453e-9f3b-df2bcf129b69","subject":"Error contract","status":"open","region":"eu","participants":["qa-06b17c7f0b0a","qa-16a35df2614a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:01.942983074Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-e093b800-c108-4c16-ac42-185674ea7182

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e093b800-c108-4c16-ac42-185674ea7182
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 55 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e093b800-c108-4c16-ac42-185674ea7182
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 10
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-e093b800-c108-4c16-ac42-185674ea7182"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-592a43de-aaeb-4cbd-aac4-11461d244795

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-592a43de-aaeb-4cbd-aac4-11461d244795
Content-Type: application/json

--- request body ---
{"handle":"qa-16a35df2614a","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-592a43de-aaeb-4cbd-aac4-11461d244795
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b25c94e-5876-49e0-a43c-21beec13aa7b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c1727c5e-e8cf-45db-a451-4af08da130c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1727c5e-e8cf-45db-a451-4af08da130c0
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c1727c5e-e8cf-45db-a451-4af08da130c0
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
correlation: qa-893ea89a-a56f-4302-9550-b92553f0f9d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-893ea89a-a56f-4302-9550-b92553f0f9d7
Content-Type: application/json

--- request body ---
{"handle":"qa-16a35df2614a","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-893ea89a-a56f-4302-9550-b92553f0f9d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-893ea89a-a56f-4302-9550-b92553f0f9d7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-00e610be-e87e-4e36-9d4b-513571d63576

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00e610be-e87e-4e36-9d4b-513571d63576
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-00e610be-e87e-4e36-9d4b-513571d63576
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d4cebe13-d9b9-4de8-9af0-41cf3f24d45d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4cebe13-d9b9-4de8-9af0-41cf3f24d45d
Content-Type: application/json

--- request body ---
{"handle":"qa-06b17c7f0b0a","password":"****"}

--- response: 401 in 44 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4cebe13-d9b9-4de8-9af0-41cf3f24d45d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d4cebe13-d9b9-4de8-9af0-41cf3f24d45d"}
```
