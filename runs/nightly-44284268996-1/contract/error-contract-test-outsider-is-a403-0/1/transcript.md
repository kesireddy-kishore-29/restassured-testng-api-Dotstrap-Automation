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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-d978ecdf-4138-402c-ac60-27f1b147241a` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-ac04a832-f9f5-4d82-a1ed-e8d12f6b42ba` |
| 3 | `POST /v1/accounts` | 201 | 21 | `qa-0f624a15-8353-4ee3-80cf-c407478e1764` |
| 4 | `POST /v1/auth/token` | 200 | 27 | `qa-8b4b9023-a436-4bde-b2ed-dbd8628319b5` |
| 5 | `POST /v1/conversations` | 201 | 10 | `qa-f216d2b7-2895-4670-9c80-2cac12954bcb` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-39d6d39e-d930-4442-85c7-ea2bb28f10aa` |
| 7 | `GET /v1/conversations/{id}` | 403 | 14 | `qa-3d00a78f-6e32-46a3-bfc3-02be9002c244` |
| 8 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-292ca57d-cbf0-4b0a-9a07-9c807541c5b9` |
| 9 | `POST /v1/auth/token` | 401 | 29 | `qa-1e681109-d905-457c-afae-1b7a7421dc72` |
| 10 | `POST /v1/auth/token` | 200 | 28 | `qa-92b492d2-6ccd-4de5-adb3-0df5ffa9411a` |
| 11 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-0af1c67f-6e5e-4602-a8a1-eb1a929d7c94` |
| 12 | `POST /v1/auth/token` | 401 | 14 | `qa-cf12b63f-4a72-4d46-bf43-c56b775a9818` |
| 13 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-43badff7-5d7a-41fc-80bb-a76fd11bece8` |
| 14 | `POST /v1/auth/token` | 401 | 15 | `qa-c8944e3c-163d-4018-b09c-a4375bb4bad4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d978ecdf-4138-402c-ac60-27f1b147241a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d978ecdf-4138-402c-ac60-27f1b147241a
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c4996fb23f","displayName":"QA c9c4996fb23f","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-d978ecdf-4138-402c-ac60-27f1b147241a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Location: /v1/accounts/qa-c9c4996fb23f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_787b3715-056c-47bd-a1a1-ed1e8520beb7","handle":"qa-c9c4996fb23f","displayName":"QA c9c4996fb23f","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.690490593Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ac04a832-f9f5-4d82-a1ed-e8d12f6b42ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac04a832-f9f5-4d82-a1ed-e8d12f6b42ba
Content-Type: application/json

--- request body ---
{"handle":"qa-8276eb49c96e","displayName":"QA 8276eb49c96e","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac04a832-f9f5-4d82-a1ed-e8d12f6b42ba
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
Location: /v1/accounts/qa-8276eb49c96e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8d8f3618-5c19-43fc-ae50-0077ea3d1ebb","handle":"qa-8276eb49c96e","displayName":"QA 8276eb49c96e","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.726309590Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-0f624a15-8353-4ee3-80cf-c407478e1764

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f624a15-8353-4ee3-80cf-c407478e1764
Content-Type: application/json

--- request body ---
{"handle":"qa-65366411b6b6","displayName":"QA 65366411b6b6","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f624a15-8353-4ee3-80cf-c407478e1764
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
Location: /v1/accounts/qa-65366411b6b6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1501d9c3-8153-4dc3-88e4-a60515378201","handle":"qa-65366411b6b6","displayName":"QA 65366411b6b6","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.750306315Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8b4b9023-a436-4bde-b2ed-dbd8628319b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b4b9023-a436-4bde-b2ed-dbd8628319b5
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c4996fb23f","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b4b9023-a436-4bde-b2ed-dbd8628319b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_787b3715-056c-47bd-a1a1-ed1e8520beb7"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-f216d2b7-2895-4670-9c80-2cac12954bcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f216d2b7-2895-4670-9c80-2cac12954bcb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8276eb49c96e","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-f216d2b7-2895-4670-9c80-2cac12954bcb
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
Location: /v1/conversations/cnv_f85e64b5-4984-46d0-8f88-fde923e9235f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f85e64b5-4984-46d0-8f88-fde923e9235f","subject":"Error contract","status":"open","region":"eu","participants":["qa-c9c4996fb23f","qa-8276eb49c96e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.812862238Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-39d6d39e-d930-4442-85c7-ea2bb28f10aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39d6d39e-d930-4442-85c7-ea2bb28f10aa
Content-Type: application/json

--- request body ---
{"handle":"qa-65366411b6b6","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-39d6d39e-d930-4442-85c7-ea2bb28f10aa
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1501d9c3-8153-4dc3-88e4-a60515378201"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_f85e64b5-4984-46d0-8f88-fde923e9235f
correlation: qa-3d00a78f-6e32-46a3-bfc3-02be9002c244

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d00a78f-6e32-46a3-bfc3-02be9002c244
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d00a78f-6e32-46a3-bfc3-02be9002c244
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f85e64b5-4984-46d0-8f88-fde923e9235f","correlationId":"qa-3d00a78f-6e32-46a3-bfc3-02be9002c244"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-292ca57d-cbf0-4b0a-9a07-9c807541c5b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-292ca57d-cbf0-4b0a-9a07-9c807541c5b9
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-292ca57d-cbf0-4b0a-9a07-9c807541c5b9
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
correlation: qa-1e681109-d905-457c-afae-1b7a7421dc72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e681109-d905-457c-afae-1b7a7421dc72
Content-Type: application/json

--- request body ---
{"handle":"qa-65366411b6b6","password":"****"}

--- response: 401 in 29 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e681109-d905-457c-afae-1b7a7421dc72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1e681109-d905-457c-afae-1b7a7421dc72"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-92b492d2-6ccd-4de5-adb3-0df5ffa9411a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92b492d2-6ccd-4de5-adb3-0df5ffa9411a
Content-Type: application/json

--- request body ---
{"handle":"qa-8276eb49c96e","password":"****"}

--- response: 200 in 28 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-92b492d2-6ccd-4de5-adb3-0df5ffa9411a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8d8f3618-5c19-43fc-ae50-0077ea3d1ebb"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0af1c67f-6e5e-4602-a8a1-eb1a929d7c94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0af1c67f-6e5e-4602-a8a1-eb1a929d7c94
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0af1c67f-6e5e-4602-a8a1-eb1a929d7c94
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
correlation: qa-cf12b63f-4a72-4d46-bf43-c56b775a9818

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf12b63f-4a72-4d46-bf43-c56b775a9818
Content-Type: application/json

--- request body ---
{"handle":"qa-8276eb49c96e","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf12b63f-4a72-4d46-bf43-c56b775a9818
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cf12b63f-4a72-4d46-bf43-c56b775a9818"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-43badff7-5d7a-41fc-80bb-a76fd11bece8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43badff7-5d7a-41fc-80bb-a76fd11bece8
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-43badff7-5d7a-41fc-80bb-a76fd11bece8
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
correlation: qa-c8944e3c-163d-4018-b09c-a4375bb4bad4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8944e3c-163d-4018-b09c-a4375bb4bad4
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c4996fb23f","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8944e3c-163d-4018-b09c-a4375bb4bad4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c8944e3c-163d-4018-b09c-a4375bb4bad4"}
```
