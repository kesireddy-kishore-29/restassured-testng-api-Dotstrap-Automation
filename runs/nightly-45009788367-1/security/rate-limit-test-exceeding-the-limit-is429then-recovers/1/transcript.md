# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 84 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-d718045e-2879-400d-9422-a4ac03afe835` |
| 2 | `POST /v1/auth/token` | 200 | 9 | `qa-8c9e986f-45f9-4539-bcb2-875564680921` |
| 3 | `GET /v1/accounts/me` | 200 | 11 | `qa-57328791-a98a-47a7-afca-acd473d57e20` |
| 4 | `GET /v1/accounts/me` | 200 | 10 | `qa-03992764-18cb-466e-838d-eaf0f4ce46b3` |
| 5 | `GET /v1/accounts/me` | 200 | 7 | `qa-33a9788e-498c-42c4-89f9-0c0f9f0c9f5d` |
| 6 | `GET /v1/accounts/me` | 200 | 6 | `qa-4822a84c-f44b-4c48-856e-b670dafc81d9` |
| 7 | `GET /v1/accounts/me` | 200 | 5 | `qa-22ff2d7b-6d03-467a-8e66-a5fdbf62b257` |
| 8 | `GET /v1/accounts/me` | 200 | 6 | `qa-2d8ae327-e729-4c74-bdfc-66f5625c51bc` |
| 9 | `GET /v1/accounts/me` | 200 | 5 | `qa-da9f932b-b0d8-415a-8eb2-0720b908aab7` |
| 10 | `GET /v1/accounts/me` | 200 | 5 | `qa-ac691f96-7869-4f95-9214-b9cca1658e58` |
| 11 | `GET /v1/accounts/me` | 200 | 7 | `qa-7b604466-3ba4-48af-bc31-edbd5d72f14a` |
| 12 | `GET /v1/accounts/me` | 200 | 8 | `qa-acdb74b8-b105-4610-964a-069de331d225` |
| 13 | `GET /v1/accounts/me` | 200 | 8 | `qa-27673dbb-91fc-4456-9eed-9cd46fab958c` |
| 14 | `GET /v1/accounts/me` | 200 | 9 | `qa-8e24457d-fbff-4213-b8d0-7dd371a4a358` |
| 15 | `GET /v1/accounts/me` | 200 | 11 | `qa-54b42381-fc24-4723-a849-218ecb99a0f3` |
| 16 | `GET /v1/accounts/me` | 200 | 5 | `qa-95a3f90e-043b-4f48-bbec-5a722d3bebe0` |
| 17 | `GET /v1/accounts/me` | 200 | 5 | `qa-b3e5d42c-a3ad-4093-bd7e-4efd9b35418d` |
| 18 | `GET /v1/accounts/me` | 200 | 10 | `qa-d4e3b98a-1ae2-46b3-a695-df092ef887ef` |
| 19 | `GET /v1/accounts/me` | 200 | 5 | `qa-f2a6f797-ccbd-4bef-86d3-715ef52442ee` |
| 20 | `GET /v1/accounts/me` | 200 | 6 | `qa-24b439b1-d864-4c38-a2b7-cdcdd98d3846` |
| 21 | `GET /v1/accounts/me` | 200 | 11 | `qa-a8d38cc5-51a9-4b80-87b3-c287014901f6` |
| 22 | `GET /v1/accounts/me` | 200 | 12 | `qa-ada472ce-a37f-472e-ba20-0a20df0bf8d6` |
| 23 | `GET /v1/accounts/me` | 200 | 8 | `qa-d79b08b3-692e-421b-b739-37ef42f2965d` |
| 24 | `GET /v1/accounts/me` | 200 | 8 | `qa-6610369b-6b86-4ed6-a369-02ef08662dc5` |
| 25 | `GET /v1/accounts/me` | 200 | 4 | `qa-67b1ba30-7ad6-445b-821e-a25355e05219` |
| 26 | `GET /v1/accounts/me` | 200 | 4 | `qa-258833c8-93ea-40d8-bc2b-eeefaafbc3d9` |
| 27 | `GET /v1/accounts/me` | 200 | 4 | `qa-5800e955-2cb6-40fc-918c-334b233f1d28` |
| 28 | `GET /v1/accounts/me` | 200 | 9 | `qa-a23d388f-de7b-4235-a6fd-c5b84fb5ad96` |
| 29 | `GET /v1/accounts/me` | 200 | 8 | `qa-38eb6218-7225-4101-885f-7e87dfdb2d87` |
| 30 | `GET /v1/accounts/me` | 200 | 25 | `qa-406b2535-6f71-4467-acc4-d11763d34f48` |
| 31 | `GET /v1/accounts/me` | 200 | 12 | `qa-54871c82-4204-4c0f-8571-94b1e115adbf` |
| 32 | `GET /v1/accounts/me` | 200 | 6 | `qa-e9028d8e-10ef-4cae-996b-9bb236ceae0f` |
| 33 | `GET /v1/accounts/me` | 200 | 6 | `qa-5028b781-4265-42a0-b3bb-59fd357af283` |
| 34 | `GET /v1/accounts/me` | 200 | 7 | `qa-78c4db32-6221-4ae2-ac91-e8176556dbd6` |
| 35 | `GET /v1/accounts/me` | 200 | 7 | `qa-b00a4b3b-7150-41a7-85ac-08e4101ffc23` |
| 36 | `GET /v1/accounts/me` | 200 | 10 | `qa-14206820-5a28-4030-bb1d-07a6e776a3f6` |
| 37 | `GET /v1/accounts/me` | 200 | 11 | `qa-2f5c9292-3720-45a3-92b7-f61a88d17261` |
| 38 | `GET /v1/accounts/me` | 200 | 6 | `qa-79df363c-8cd1-4229-bf6a-d1d6002bc62f` |
| 39 | `GET /v1/accounts/me` | 200 | 5 | `qa-dc8c89dc-0ab3-4559-937d-60b9b8cfef4c` |
| 40 | `GET /v1/accounts/me` | 200 | 8 | `qa-ace61856-d072-4c4b-aa9f-b5aba9f41e58` |
| 41 | `GET /v1/accounts/me` | 200 | 6 | `qa-99e65b39-202e-4eb9-abf2-856e81ca97c2` |
| 42 | `GET /v1/accounts/me` | 200 | 3 | `qa-5b69ce54-7c34-46ad-ad91-bffc54b03021` |
| 43 | `GET /v1/accounts/me` | 200 | 3 | `qa-5a46d86c-e448-4e96-b604-1ed8382ae9dd` |
| 44 | `GET /v1/accounts/me` | 200 | 4 | `qa-316c7545-c421-4a35-9464-adcf041bc6a5` |
| 45 | `GET /v1/accounts/me` | 200 | 3 | `qa-e84ea723-ed08-428e-81d4-d45c1f8cae0e` |
| 46 | `GET /v1/accounts/me` | 200 | 3 | `qa-b53caea6-3a56-4d49-b0ac-6df04cd150a4` |
| 47 | `GET /v1/accounts/me` | 200 | 3 | `qa-0a7863ce-5fc2-45f8-bd24-4f0b44c86417` |
| 48 | `GET /v1/accounts/me` | 200 | 3 | `qa-66d81df2-0c40-4744-9752-be6f89cb7838` |
| 49 | `GET /v1/accounts/me` | 200 | 3 | `qa-6558af72-82f6-42ef-8a72-eac3999caffa` |
| 50 | `GET /v1/accounts/me` | 200 | 3 | `qa-5e6d707f-ac2b-4513-bb5b-e0215688f04d` |
| 51 | `GET /v1/accounts/me` | 200 | 3 | `qa-da4de9f7-467d-4af7-83b4-ec57327395a6` |
| 52 | `GET /v1/accounts/me` | 200 | 5 | `qa-f4764af5-71a5-4416-acaf-674ec368fa9f` |
| 53 | `GET /v1/accounts/me` | 200 | 6 | `qa-90d5ad9c-b8f6-4138-b47a-6f06c593ce1e` |
| 54 | `GET /v1/accounts/me` | 200 | 3 | `qa-1d8e826a-45cd-419b-9997-3bb065e28522` |
| 55 | `GET /v1/accounts/me` | 200 | 3 | `qa-7a51bd7d-622b-4625-bf1f-531adf79b00b` |
| 56 | `GET /v1/accounts/me` | 200 | 7 | `qa-f8646c06-efb0-41ef-a38d-28bec8695894` |
| 57 | `GET /v1/accounts/me` | 200 | 10 | `qa-45309375-06fa-41d9-99b3-102a95030218` |
| 58 | `GET /v1/accounts/me` | 200 | 3 | `qa-670f21a4-f5ba-49cb-a00b-82b027e967ce` |
| 59 | `GET /v1/accounts/me` | 200 | 4 | `qa-7cc7bf84-6355-4586-aef3-4b810eb20d78` |
| 60 | `GET /v1/accounts/me` | 200 | 4 | `qa-3775b326-8365-4418-9127-2bc37f231320` |
| 61 | `GET /v1/accounts/me` | 200 | 7 | `qa-3e7e0289-d4dc-4c14-bc5d-e4c4df267138` |
| 62 | `GET /v1/accounts/me` | 200 | 3 | `qa-e29b7433-4c2d-4229-8647-e6741457ba2a` |
| 63 | `GET /v1/accounts/me` | 429 | 3 | `qa-a437626b-b9aa-4054-80fc-c350e8e1e9c2` |
| 64 | `GET /v1/accounts/me` | 429 | 4 | `qa-9d9f1bd4-eb70-4dd8-bc84-d34228aaf898` |
| 65 | `GET /v1/accounts/me` | 429 | 6 | `qa-469239c4-cc6f-48a2-b33b-9b74308900e9` |
| 66 | `GET /v1/accounts/me` | 429 | 5 | `qa-6f4b5a60-fc10-4b10-998e-c0aa107c5b09` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-c1b54540-212d-4733-bb44-8ec9220988d2` |
| 68 | `GET /v1/accounts/me` | 429 | 5 | `qa-7d7c1a78-0980-4b98-92aa-f3edb0b33338` |
| 69 | `GET /v1/accounts/me` | 429 | 3 | `qa-a59a6754-e281-42fb-ac0f-6d38aa0377eb` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-7bcdb339-349e-4dd2-b552-2ffd2a91261d` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-eb7d0717-8e97-42a1-a723-77669a03d02c` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-53edc990-9e6f-4ca7-ada4-0351d412447e` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-46c32380-2a47-4a17-97c2-e2d7a77300b2` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-a37c7286-b91b-4315-98be-ab0c93cfadbf` |
| 75 | `GET /v1/accounts/me` | 429 | 4 | `qa-1a348b13-94d7-49ff-90c9-fad69630ccf6` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-6ee308b9-cd10-4e56-aac2-ba51ed673778` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-e2fe9bfb-6d3e-4b43-9201-e69d797a2978` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-f437a343-4480-4289-a1be-d7b285adb5d8` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-29005e71-54cd-4e45-b9c2-0246dd8eca0e` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-61f79905-639d-4687-9ab5-0928c39a2b93` |
| 81 | `GET /v1/accounts/me` | 429 | 4 | `qa-dd056632-0bff-4ae4-b5d4-558adc4aa5e4` |
| 82 | `GET /v1/accounts/me` | 200 | 4 | `qa-8de18e83-3fde-425a-9107-5e466ddc6622` |
| 83 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-4f46d397-edfe-4486-b04f-797541e30dd1` |
| 84 | `POST /v1/auth/token` | 401 | 3 | `qa-a4a6992c-836d-4e3e-be5f-7fa4ff9c264b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d718045e-2879-400d-9422-a4ac03afe835

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d718045e-2879-400d-9422-a4ac03afe835
Content-Type: application/json

--- request body ---
{"handle":"qa-83775674eb85","displayName":"QA 83775674eb85","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d718045e-2879-400d-9422-a4ac03afe835
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
Location: /v1/accounts/qa-83775674eb85
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8c9e986f-45f9-4539-bcb2-875564680921

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c9e986f-45f9-4539-bcb2-875564680921
Content-Type: application/json

--- request body ---
{"handle":"qa-83775674eb85","password":"****"}

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c9e986f-45f9-4539-bcb2-875564680921
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_323cb634-f222-46e3-9ef3-1446590d1933"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-57328791-a98a-47a7-afca-acd473d57e20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57328791-a98a-47a7-afca-acd473d57e20
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-57328791-a98a-47a7-afca-acd473d57e20
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
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-03992764-18cb-466e-838d-eaf0f4ce46b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03992764-18cb-466e-838d-eaf0f4ce46b3
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-03992764-18cb-466e-838d-eaf0f4ce46b3
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
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-33a9788e-498c-42c4-89f9-0c0f9f0c9f5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33a9788e-498c-42c4-89f9-0c0f9f0c9f5d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-33a9788e-498c-42c4-89f9-0c0f9f0c9f5d
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
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-4822a84c-f44b-4c48-856e-b670dafc81d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4822a84c-f44b-4c48-856e-b670dafc81d9
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-4822a84c-f44b-4c48-856e-b670dafc81d9
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
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-22ff2d7b-6d03-467a-8e66-a5fdbf62b257

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22ff2d7b-6d03-467a-8e66-a5fdbf62b257
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-22ff2d7b-6d03-467a-8e66-a5fdbf62b257
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
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-2d8ae327-e729-4c74-bdfc-66f5625c51bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d8ae327-e729-4c74-bdfc-66f5625c51bc
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d8ae327-e729-4c74-bdfc-66f5625c51bc
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
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-da9f932b-b0d8-415a-8eb2-0720b908aab7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da9f932b-b0d8-415a-8eb2-0720b908aab7
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-da9f932b-b0d8-415a-8eb2-0720b908aab7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac691f96-7869-4f95-9214-b9cca1658e58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac691f96-7869-4f95-9214-b9cca1658e58
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac691f96-7869-4f95-9214-b9cca1658e58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-7b604466-3ba4-48af-bc31-edbd5d72f14a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b604466-3ba4-48af-bc31-edbd5d72f14a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b604466-3ba4-48af-bc31-edbd5d72f14a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-acdb74b8-b105-4610-964a-069de331d225

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acdb74b8-b105-4610-964a-069de331d225
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-acdb74b8-b105-4610-964a-069de331d225
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-27673dbb-91fc-4456-9eed-9cd46fab958c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27673dbb-91fc-4456-9eed-9cd46fab958c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-27673dbb-91fc-4456-9eed-9cd46fab958c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e24457d-fbff-4213-b8d0-7dd371a4a358

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e24457d-fbff-4213-b8d0-7dd371a4a358
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e24457d-fbff-4213-b8d0-7dd371a4a358
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-54b42381-fc24-4723-a849-218ecb99a0f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54b42381-fc24-4723-a849-218ecb99a0f3
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-54b42381-fc24-4723-a849-218ecb99a0f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-95a3f90e-043b-4f48-bbec-5a722d3bebe0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95a3f90e-043b-4f48-bbec-5a722d3bebe0
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-95a3f90e-043b-4f48-bbec-5a722d3bebe0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-b3e5d42c-a3ad-4093-bd7e-4efd9b35418d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3e5d42c-a3ad-4093-bd7e-4efd9b35418d
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3e5d42c-a3ad-4093-bd7e-4efd9b35418d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-d4e3b98a-1ae2-46b3-a695-df092ef887ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4e3b98a-1ae2-46b3-a695-df092ef887ef
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4e3b98a-1ae2-46b3-a695-df092ef887ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-f2a6f797-ccbd-4bef-86d3-715ef52442ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2a6f797-ccbd-4bef-86d3-715ef52442ee
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2a6f797-ccbd-4bef-86d3-715ef52442ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-24b439b1-d864-4c38-a2b7-cdcdd98d3846

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24b439b1-d864-4c38-a2b7-cdcdd98d3846
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-24b439b1-d864-4c38-a2b7-cdcdd98d3846
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-a8d38cc5-51a9-4b80-87b3-c287014901f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8d38cc5-51a9-4b80-87b3-c287014901f6
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8d38cc5-51a9-4b80-87b3-c287014901f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-ada472ce-a37f-472e-ba20-0a20df0bf8d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ada472ce-a37f-472e-ba20-0a20df0bf8d6
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-ada472ce-a37f-472e-ba20-0a20df0bf8d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-d79b08b3-692e-421b-b739-37ef42f2965d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d79b08b3-692e-421b-b739-37ef42f2965d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-d79b08b3-692e-421b-b739-37ef42f2965d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-6610369b-6b86-4ed6-a369-02ef08662dc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6610369b-6b86-4ed6-a369-02ef08662dc5
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-6610369b-6b86-4ed6-a369-02ef08662dc5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-67b1ba30-7ad6-445b-821e-a25355e05219

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67b1ba30-7ad6-445b-821e-a25355e05219
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-67b1ba30-7ad6-445b-821e-a25355e05219
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-258833c8-93ea-40d8-bc2b-eeefaafbc3d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-258833c8-93ea-40d8-bc2b-eeefaafbc3d9
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-258833c8-93ea-40d8-bc2b-eeefaafbc3d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-5800e955-2cb6-40fc-918c-334b233f1d28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5800e955-2cb6-40fc-918c-334b233f1d28
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-5800e955-2cb6-40fc-918c-334b233f1d28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-a23d388f-de7b-4235-a6fd-c5b84fb5ad96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a23d388f-de7b-4235-a6fd-c5b84fb5ad96
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a23d388f-de7b-4235-a6fd-c5b84fb5ad96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-38eb6218-7225-4101-885f-7e87dfdb2d87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38eb6218-7225-4101-885f-7e87dfdb2d87
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-38eb6218-7225-4101-885f-7e87dfdb2d87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-406b2535-6f71-4467-acc4-d11763d34f48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-406b2535-6f71-4467-acc4-d11763d34f48
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-406b2535-6f71-4467-acc4-d11763d34f48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-54871c82-4204-4c0f-8571-94b1e115adbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54871c82-4204-4c0f-8571-94b1e115adbf
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-54871c82-4204-4c0f-8571-94b1e115adbf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-e9028d8e-10ef-4cae-996b-9bb236ceae0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9028d8e-10ef-4cae-996b-9bb236ceae0f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9028d8e-10ef-4cae-996b-9bb236ceae0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-5028b781-4265-42a0-b3bb-59fd357af283

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5028b781-4265-42a0-b3bb-59fd357af283
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-5028b781-4265-42a0-b3bb-59fd357af283
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-78c4db32-6221-4ae2-ac91-e8176556dbd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78c4db32-6221-4ae2-ac91-e8176556dbd6
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-78c4db32-6221-4ae2-ac91-e8176556dbd6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-b00a4b3b-7150-41a7-85ac-08e4101ffc23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b00a4b3b-7150-41a7-85ac-08e4101ffc23
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b00a4b3b-7150-41a7-85ac-08e4101ffc23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-14206820-5a28-4030-bb1d-07a6e776a3f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14206820-5a28-4030-bb1d-07a6e776a3f6
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-14206820-5a28-4030-bb1d-07a6e776a3f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-2f5c9292-3720-45a3-92b7-f61a88d17261

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f5c9292-3720-45a3-92b7-f61a88d17261
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f5c9292-3720-45a3-92b7-f61a88d17261
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-79df363c-8cd1-4229-bf6a-d1d6002bc62f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79df363c-8cd1-4229-bf6a-d1d6002bc62f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-79df363c-8cd1-4229-bf6a-d1d6002bc62f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-dc8c89dc-0ab3-4559-937d-60b9b8cfef4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc8c89dc-0ab3-4559-937d-60b9b8cfef4c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc8c89dc-0ab3-4559-937d-60b9b8cfef4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-ace61856-d072-4c4b-aa9f-b5aba9f41e58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ace61856-d072-4c4b-aa9f-b5aba9f41e58
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-ace61856-d072-4c4b-aa9f-b5aba9f41e58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-99e65b39-202e-4eb9-abf2-856e81ca97c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99e65b39-202e-4eb9-abf2-856e81ca97c2
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-99e65b39-202e-4eb9-abf2-856e81ca97c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b69ce54-7c34-46ad-ad91-bffc54b03021

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b69ce54-7c34-46ad-ad91-bffc54b03021
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b69ce54-7c34-46ad-ad91-bffc54b03021
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a46d86c-e448-4e96-b604-1ed8382ae9dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a46d86c-e448-4e96-b604-1ed8382ae9dd
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a46d86c-e448-4e96-b604-1ed8382ae9dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-316c7545-c421-4a35-9464-adcf041bc6a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-316c7545-c421-4a35-9464-adcf041bc6a5
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-316c7545-c421-4a35-9464-adcf041bc6a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-e84ea723-ed08-428e-81d4-d45c1f8cae0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e84ea723-ed08-428e-81d4-d45c1f8cae0e
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-e84ea723-ed08-428e-81d4-d45c1f8cae0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-b53caea6-3a56-4d49-b0ac-6df04cd150a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b53caea6-3a56-4d49-b0ac-6df04cd150a4
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b53caea6-3a56-4d49-b0ac-6df04cd150a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-0a7863ce-5fc2-45f8-bd24-4f0b44c86417

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a7863ce-5fc2-45f8-bd24-4f0b44c86417
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a7863ce-5fc2-45f8-bd24-4f0b44c86417
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-66d81df2-0c40-4744-9752-be6f89cb7838

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66d81df2-0c40-4744-9752-be6f89cb7838
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-66d81df2-0c40-4744-9752-be6f89cb7838
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-6558af72-82f6-42ef-8a72-eac3999caffa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6558af72-82f6-42ef-8a72-eac3999caffa
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-6558af72-82f6-42ef-8a72-eac3999caffa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-5e6d707f-ac2b-4513-bb5b-e0215688f04d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e6d707f-ac2b-4513-bb5b-e0215688f04d
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e6d707f-ac2b-4513-bb5b-e0215688f04d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-da4de9f7-467d-4af7-83b4-ec57327395a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da4de9f7-467d-4af7-83b4-ec57327395a6
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-da4de9f7-467d-4af7-83b4-ec57327395a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-f4764af5-71a5-4416-acaf-674ec368fa9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4764af5-71a5-4416-acaf-674ec368fa9f
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4764af5-71a5-4416-acaf-674ec368fa9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-90d5ad9c-b8f6-4138-b47a-6f06c593ce1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90d5ad9c-b8f6-4138-b47a-6f06c593ce1e
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-90d5ad9c-b8f6-4138-b47a-6f06c593ce1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-1d8e826a-45cd-419b-9997-3bb065e28522

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d8e826a-45cd-419b-9997-3bb065e28522
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d8e826a-45cd-419b-9997-3bb065e28522
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-7a51bd7d-622b-4625-bf1f-531adf79b00b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a51bd7d-622b-4625-bf1f-531adf79b00b
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a51bd7d-622b-4625-bf1f-531adf79b00b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-f8646c06-efb0-41ef-a38d-28bec8695894

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8646c06-efb0-41ef-a38d-28bec8695894
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8646c06-efb0-41ef-a38d-28bec8695894
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-45309375-06fa-41d9-99b3-102a95030218

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45309375-06fa-41d9-99b3-102a95030218
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-45309375-06fa-41d9-99b3-102a95030218
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-670f21a4-f5ba-49cb-a00b-82b027e967ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-670f21a4-f5ba-49cb-a00b-82b027e967ce
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-670f21a4-f5ba-49cb-a00b-82b027e967ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-7cc7bf84-6355-4586-aef3-4b810eb20d78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cc7bf84-6355-4586-aef3-4b810eb20d78
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cc7bf84-6355-4586-aef3-4b810eb20d78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-3775b326-8365-4418-9127-2bc37f231320

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3775b326-8365-4418-9127-2bc37f231320
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-3775b326-8365-4418-9127-2bc37f231320
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-3e7e0289-d4dc-4c14-bc5d-e4c4df267138

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e7e0289-d4dc-4c14-bc5d-e4c4df267138
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e7e0289-d4dc-4c14-bc5d-e4c4df267138
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-e29b7433-4c2d-4229-8647-e6741457ba2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e29b7433-4c2d-4229-8647-e6741457ba2a
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-e29b7433-4c2d-4229-8647-e6741457ba2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-a437626b-b9aa-4054-80fc-c350e8e1e9c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a437626b-b9aa-4054-80fc-c350e8e1e9c2
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a437626b-b9aa-4054-80fc-c350e8e1e9c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
Retry-After: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 10 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a437626b-b9aa-4054-80fc-c350e8e1e9c2"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-9d9f1bd4-eb70-4dd8-bc84-d34228aaf898

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d9f1bd4-eb70-4dd8-bc84-d34228aaf898
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d9f1bd4-eb70-4dd8-bc84-d34228aaf898
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9d9f1bd4-eb70-4dd8-bc84-d34228aaf898"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-469239c4-cc6f-48a2-b33b-9b74308900e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-469239c4-cc6f-48a2-b33b-9b74308900e9
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-469239c4-cc6f-48a2-b33b-9b74308900e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-469239c4-cc6f-48a2-b33b-9b74308900e9"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-6f4b5a60-fc10-4b10-998e-c0aa107c5b09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f4b5a60-fc10-4b10-998e-c0aa107c5b09
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f4b5a60-fc10-4b10-998e-c0aa107c5b09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6f4b5a60-fc10-4b10-998e-c0aa107c5b09"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-c1b54540-212d-4733-bb44-8ec9220988d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1b54540-212d-4733-bb44-8ec9220988d2
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1b54540-212d-4733-bb44-8ec9220988d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c1b54540-212d-4733-bb44-8ec9220988d2"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-7d7c1a78-0980-4b98-92aa-f3edb0b33338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d7c1a78-0980-4b98-92aa-f3edb0b33338
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7d7c1a78-0980-4b98-92aa-f3edb0b33338
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7d7c1a78-0980-4b98-92aa-f3edb0b33338"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-a59a6754-e281-42fb-ac0f-6d38aa0377eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a59a6754-e281-42fb-ac0f-6d38aa0377eb
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a59a6754-e281-42fb-ac0f-6d38aa0377eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a59a6754-e281-42fb-ac0f-6d38aa0377eb"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-7bcdb339-349e-4dd2-b552-2ffd2a91261d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bcdb339-349e-4dd2-b552-2ffd2a91261d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7bcdb339-349e-4dd2-b552-2ffd2a91261d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7bcdb339-349e-4dd2-b552-2ffd2a91261d"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb7d0717-8e97-42a1-a723-77669a03d02c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb7d0717-8e97-42a1-a723-77669a03d02c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb7d0717-8e97-42a1-a723-77669a03d02c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-eb7d0717-8e97-42a1-a723-77669a03d02c"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-53edc990-9e6f-4ca7-ada4-0351d412447e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53edc990-9e6f-4ca7-ada4-0351d412447e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53edc990-9e6f-4ca7-ada4-0351d412447e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-53edc990-9e6f-4ca7-ada4-0351d412447e"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-46c32380-2a47-4a17-97c2-e2d7a77300b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46c32380-2a47-4a17-97c2-e2d7a77300b2
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46c32380-2a47-4a17-97c2-e2d7a77300b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-46c32380-2a47-4a17-97c2-e2d7a77300b2"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-a37c7286-b91b-4315-98be-ab0c93cfadbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a37c7286-b91b-4315-98be-ab0c93cfadbf
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a37c7286-b91b-4315-98be-ab0c93cfadbf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a37c7286-b91b-4315-98be-ab0c93cfadbf"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-1a348b13-94d7-49ff-90c9-fad69630ccf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a348b13-94d7-49ff-90c9-fad69630ccf6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a348b13-94d7-49ff-90c9-fad69630ccf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1a348b13-94d7-49ff-90c9-fad69630ccf6"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ee308b9-cd10-4e56-aac2-ba51ed673778

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ee308b9-cd10-4e56-aac2-ba51ed673778
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ee308b9-cd10-4e56-aac2-ba51ed673778
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6ee308b9-cd10-4e56-aac2-ba51ed673778"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-e2fe9bfb-6d3e-4b43-9201-e69d797a2978

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2fe9bfb-6d3e-4b43-9201-e69d797a2978
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2fe9bfb-6d3e-4b43-9201-e69d797a2978
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e2fe9bfb-6d3e-4b43-9201-e69d797a2978"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-f437a343-4480-4289-a1be-d7b285adb5d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f437a343-4480-4289-a1be-d7b285adb5d8
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f437a343-4480-4289-a1be-d7b285adb5d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f437a343-4480-4289-a1be-d7b285adb5d8"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-29005e71-54cd-4e45-b9c2-0246dd8eca0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29005e71-54cd-4e45-b9c2-0246dd8eca0e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29005e71-54cd-4e45-b9c2-0246dd8eca0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-29005e71-54cd-4e45-b9c2-0246dd8eca0e"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-61f79905-639d-4687-9ab5-0928c39a2b93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61f79905-639d-4687-9ab5-0928c39a2b93
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61f79905-639d-4687-9ab5-0928c39a2b93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-61f79905-639d-4687-9ab5-0928c39a2b93"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-dd056632-0bff-4ae4-b5d4-558adc4aa5e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd056632-0bff-4ae4-b5d4-558adc4aa5e4
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dd056632-0bff-4ae4-b5d4-558adc4aa5e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-dd056632-0bff-4ae4-b5d4-558adc4aa5e4"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-8de18e83-3fde-425a-9107-5e466ddc6622

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8de18e83-3fde-425a-9107-5e466ddc6622
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 22 Nov 2026 09:55:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-8de18e83-3fde-425a-9107-5e466ddc6622
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
Content-Length: 181

{"id":"acc_323cb634-f222-46e3-9ef3-1446590d1933","handle":"qa-83775674eb85","displayName":"QA 83775674eb85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.684629301Z"}
```

## 83. DELETE /v1/accounts/me

```text
#83 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f46d397-edfe-4486-b04f-797541e30dd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f46d397-edfe-4486-b04f-797541e30dd1
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 22 Nov 2026 09:55:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f46d397-edfe-4486-b04f-797541e30dd1
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

## 84. POST /v1/auth/token

```text
#84 POST http://localhost:7070/v1/auth/token
correlation: qa-a4a6992c-836d-4e3e-be5f-7fa4ff9c264b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4a6992c-836d-4e3e-be5f-7fa4ff9c264b
Content-Type: application/json

--- request body ---
{"handle":"qa-83775674eb85","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 22 Nov 2026 09:55:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4a6992c-836d-4e3e-be5f-7fa4ff9c264b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a4a6992c-836d-4e3e-be5f-7fa4ff9c264b"}
```
