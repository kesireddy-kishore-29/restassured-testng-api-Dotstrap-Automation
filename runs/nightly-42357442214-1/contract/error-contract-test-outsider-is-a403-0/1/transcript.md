# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-f4726e59-a33e-4624-9b41-bbe3af41a677` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-8c359c6c-79cf-407c-ab9d-165d1d7c069c` |
| 3 | `POST /v1/accounts` | 201 | 20 | `qa-85e94b69-6b74-4e46-a23d-19e832aa54e0` |
| 4 | `POST /v1/auth/token` | 200 | 28 | `qa-221c4a9f-d7c3-4535-8421-8bfc9d43eaa4` |
| 5 | `POST /v1/conversations` | 201 | 16 | `qa-042c0dd9-70aa-4075-909c-4ff04bc0ce3b` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-c44d1dfe-09a3-4596-b5c2-83275776a327` |
| 7 | `GET /v1/conversations/{id}` | 403 | 23 | `qa-0d107234-884a-4148-97c7-fbee6db229e2` |
| 8 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-ae80b1b3-0757-42be-9a23-6be3e547b9b4` |
| 9 | `POST /v1/auth/token` | 401 | 28 | `qa-05df21d6-a6f4-4b33-ba62-fd5537f58d5b` |
| 10 | `POST /v1/auth/token` | 200 | 35 | `qa-056593e1-fe51-4f75-b685-ce150ab5a383` |
| 11 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-77a86d2c-9b20-4bec-bfea-75cdbb699839` |
| 12 | `POST /v1/auth/token` | 401 | 12 | `qa-d2e72120-a121-486b-a5cb-b50e831d4289` |
| 13 | `DELETE /v1/accounts/me` | 204 | 60 | `qa-16603111-fc5b-43c1-8e59-d46c534d9f9f` |
| 14 | `POST /v1/auth/token` | 401 | 18 | `qa-d0cef709-6acf-4df5-acef-c465925f954c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f4726e59-a33e-4624-9b41-bbe3af41a677

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4726e59-a33e-4624-9b41-bbe3af41a677
Content-Type: application/json

--- request body ---
{"handle":"qa-d3ad348b145b","displayName":"QA d3ad348b145b","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4726e59-a33e-4624-9b41-bbe3af41a677
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 10
Location: /v1/accounts/qa-d3ad348b145b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_05010d48-b8f0-40fe-b5d1-711adef65b9c","handle":"qa-d3ad348b145b","displayName":"QA d3ad348b145b","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.246934862Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8c359c6c-79cf-407c-ab9d-165d1d7c069c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c359c6c-79cf-407c-ab9d-165d1d7c069c
Content-Type: application/json

--- request body ---
{"handle":"qa-73336f59778f","displayName":"QA 73336f59778f","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c359c6c-79cf-407c-ab9d-165d1d7c069c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Location: /v1/accounts/qa-73336f59778f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b4a1267b-29dd-48cc-862e-6ab3e27e144d","handle":"qa-73336f59778f","displayName":"QA 73336f59778f","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.284567195Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-85e94b69-6b74-4e46-a23d-19e832aa54e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85e94b69-6b74-4e46-a23d-19e832aa54e0
Content-Type: application/json

--- request body ---
{"handle":"qa-bd7f4644dcfb","displayName":"QA bd7f4644dcfb","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-85e94b69-6b74-4e46-a23d-19e832aa54e0
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
Location: /v1/accounts/qa-bd7f4644dcfb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_660ae96f-9d66-41ce-bc5b-832641a988d9","handle":"qa-bd7f4644dcfb","displayName":"QA bd7f4644dcfb","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.323110554Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-221c4a9f-d7c3-4535-8421-8bfc9d43eaa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-221c4a9f-d7c3-4535-8421-8bfc9d43eaa4
Content-Type: application/json

--- request body ---
{"handle":"qa-d3ad348b145b","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-221c4a9f-d7c3-4535-8421-8bfc9d43eaa4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_05010d48-b8f0-40fe-b5d1-711adef65b9c"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-042c0dd9-70aa-4075-909c-4ff04bc0ce3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-042c0dd9-70aa-4075-909c-4ff04bc0ce3b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-73336f59778f","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-042c0dd9-70aa-4075-909c-4ff04bc0ce3b
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
Location: /v1/conversations/cnv_9089692f-11fd-4794-bd41-6337f508abb4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9089692f-11fd-4794-bd41-6337f508abb4","subject":"Error contract","status":"open","region":"eu","participants":["qa-d3ad348b145b","qa-73336f59778f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:57.385430848Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c44d1dfe-09a3-4596-b5c2-83275776a327

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c44d1dfe-09a3-4596-b5c2-83275776a327
Content-Type: application/json

--- request body ---
{"handle":"qa-bd7f4644dcfb","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c44d1dfe-09a3-4596-b5c2-83275776a327
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_660ae96f-9d66-41ce-bc5b-832641a988d9"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_9089692f-11fd-4794-bd41-6337f508abb4
correlation: qa-0d107234-884a-4148-97c7-fbee6db229e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d107234-884a-4148-97c7-fbee6db229e2
Content-Type: application/json

--- response: 403 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d107234-884a-4148-97c7-fbee6db229e2
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_9089692f-11fd-4794-bd41-6337f508abb4","correlationId":"qa-0d107234-884a-4148-97c7-fbee6db229e2"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae80b1b3-0757-42be-9a23-6be3e547b9b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae80b1b3-0757-42be-9a23-6be3e547b9b4
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ae80b1b3-0757-42be-9a23-6be3e547b9b4
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
correlation: qa-05df21d6-a6f4-4b33-ba62-fd5537f58d5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05df21d6-a6f4-4b33-ba62-fd5537f58d5b
Content-Type: application/json

--- request body ---
{"handle":"qa-bd7f4644dcfb","password":"****"}

--- response: 401 in 28 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05df21d6-a6f4-4b33-ba62-fd5537f58d5b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-05df21d6-a6f4-4b33-ba62-fd5537f58d5b"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-056593e1-fe51-4f75-b685-ce150ab5a383

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-056593e1-fe51-4f75-b685-ce150ab5a383
Content-Type: application/json

--- request body ---
{"handle":"qa-73336f59778f","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-056593e1-fe51-4f75-b685-ce150ab5a383
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b4a1267b-29dd-48cc-862e-6ab3e27e144d"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-77a86d2c-9b20-4bec-bfea-75cdbb699839

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77a86d2c-9b20-4bec-bfea-75cdbb699839
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-77a86d2c-9b20-4bec-bfea-75cdbb699839
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
correlation: qa-d2e72120-a121-486b-a5cb-b50e831d4289

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2e72120-a121-486b-a5cb-b50e831d4289
Content-Type: application/json

--- request body ---
{"handle":"qa-73336f59778f","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2e72120-a121-486b-a5cb-b50e831d4289
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d2e72120-a121-486b-a5cb-b50e831d4289"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-16603111-fc5b-43c1-8e59-d46c534d9f9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16603111-fc5b-43c1-8e59-d46c534d9f9f
Content-Type: application/json

--- response: 204 in 60 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-16603111-fc5b-43c1-8e59-d46c534d9f9f
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
correlation: qa-d0cef709-6acf-4df5-acef-c465925f954c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0cef709-6acf-4df5-acef-c465925f954c
Content-Type: application/json

--- request body ---
{"handle":"qa-d3ad348b145b","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0cef709-6acf-4df5-acef-c465925f954c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d0cef709-6acf-4df5-acef-c465925f954c"}
```
